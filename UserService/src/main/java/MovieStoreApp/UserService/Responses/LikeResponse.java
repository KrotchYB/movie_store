package MovieStoreApp.UserService.Responses;

import MovieStoreApp.UserService.Entities.Like;
import lombok.Data;

@Data
public class LikeResponse {

    Long id;
    Long userId;
    Long movieId;

    public LikeResponse(Like entity) {
        this.id = entity.getId();
        this.userId = entity.getUser().getId();
        this.movieId = entity.getMovieId();
    }
}
