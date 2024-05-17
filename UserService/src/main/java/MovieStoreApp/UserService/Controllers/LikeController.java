package MovieStoreApp.UserService.Controllers;

import MovieStoreApp.UserService.Entities.Like;
import MovieStoreApp.UserService.Requests.LikeCreateRequest;
import MovieStoreApp.UserService.Responses.LikeResponse;
import MovieStoreApp.UserService.Services.LikeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/likes")
public class LikeController {

    private LikeService likeService;

    public LikeController(LikeService likeService) {
        this.likeService = likeService;
    }

    @GetMapping
    public List<LikeResponse> getAllLikes(@RequestParam Optional<Long> userId,
                                          @RequestParam Optional<Long> movieId){
        return likeService.getAllLikesWithParam(userId, movieId);
    }


    @GetMapping("/{likeId}")
    public ResponseEntity<Like> getOneLike(@PathVariable Long likeId){
        try {
            return ResponseEntity.ok(likeService.getOneLikeById(likeId));
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{likeId}")
    public void deleteOneLike(@PathVariable Long likeId){
        likeService.deleteOneLikeById(likeId);
    }

    @PostMapping
    public Like createOneLike(@RequestBody LikeCreateRequest request){
        return likeService.createOneLike(request);
    }
}
