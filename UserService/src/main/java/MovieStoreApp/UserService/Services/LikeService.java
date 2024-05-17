package MovieStoreApp.UserService.Services;

import MovieStoreApp.UserService.Entities.Like;
import MovieStoreApp.UserService.Entities.User;
import MovieStoreApp.UserService.Repos.LikeRepository;
import MovieStoreApp.UserService.Requests.LikeCreateRequest;
import MovieStoreApp.UserService.Responses.LikeResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class LikeService {


    private LikeRepository likeRepository;

    private UserService userService;

    public LikeService(LikeRepository likeRepository, UserService userService) {
        this.likeRepository = likeRepository;
        this.userService = userService;
    }




    public List<LikeResponse> getAllLikesWithParam(Optional<Long> userId, Optional<Long> movieId) {
        List<Like> likeList;
        if(userId.isPresent() && movieId.isPresent()){
            likeList = likeRepository.findByUserIdAndMovieId(userId.get(), movieId.get());
        }
        else if(userId.isPresent()){
            likeList =  likeRepository.findByUserId(userId.get());
        }
        else if(movieId.isPresent()){
            likeList =  likeRepository.findByMovieId(movieId.get());
        }
        else likeList = likeRepository.findAll();

        return likeList.stream().map(like -> new LikeResponse(like)).collect(Collectors.toList());
    }

    public Like getOneLikeById(Long likeId) {
        return likeRepository.findById(likeId).orElse(null);
    }

    public void deleteOneLikeById(Long likeId) {
        likeRepository.deleteById(likeId);
    }

    //movie_id check yapılmalı
    public Like createOneLike(LikeCreateRequest request) {
        User user = userService.getOneUserById(request.getUserId());

        if(user != null){
            Like toSave = new Like();
            toSave.setId(request.getId());
            toSave.setMovieId(request.getMovieId());
            toSave.setUser(user);
            return likeRepository.save(toSave);
        }

        return null;
    }
}
