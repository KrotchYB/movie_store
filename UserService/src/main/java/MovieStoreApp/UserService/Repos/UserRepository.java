package MovieStoreApp.UserService.Repos;

import MovieStoreApp.UserService.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByUserName(String userName);
}
