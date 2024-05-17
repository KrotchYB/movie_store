package MovieStoreApp.UserService.Requests;

import lombok.Data;

@Data
public class LikeCreateRequest {

    Long id;
    Long userId;
    Long movieId;
}
