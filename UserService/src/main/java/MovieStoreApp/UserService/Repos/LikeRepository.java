package MovieStoreApp.UserService.Repos;

import MovieStoreApp.UserService.Entities.Like;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LikeRepository extends JpaRepository<Like, Long> {

    List<Like> findByUserIdAndMovieId(Long userId, Long movieId);

    List<Like> findByUserId(Long userId);

    List<Like> findByMovieId(Long movieId);
}
