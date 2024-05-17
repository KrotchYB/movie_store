package MovieStoreApp.UserService.Services;

import MovieStoreApp.UserService.Entities.User;
import MovieStoreApp.UserService.Repos.UserRepository;
import MovieStoreApp.UserService.Utils.EnumLibrary;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public  User createOneUser(User newUser) {
        return userRepository.save(newUser);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getOneUserById(Long userId) {
        return  userRepository.findById(userId).orElse(null);
    }

    public User updateOneUserById(Long userId, User newUser) {

        Optional<User> user = userRepository.findById(userId);
        if(user.isPresent()){
            User foundUser = user.get();
            foundUser.setUserName(newUser.getUserName());
            foundUser.setPassword(newUser.getPassword());
            foundUser.setFirstName(newUser.getFirstName());
            foundUser.setMiddleName(newUser.getMiddleName());
            foundUser.setLastName(newUser.getLastName());
            foundUser.setBirthDate(newUser.getBirthDate());
            foundUser.setGender(newUser.getGender());

            userRepository.save(foundUser);
            return  foundUser;
        }else return null;
    }

    public void deleteOneUserById(Long userId) {
        userRepository.deleteById(userId);
    }

    public void testmet() {
        User foundUser = new User();
        foundUser.setUserName("krotchy");
        foundUser.setPassword("123456");
        foundUser.setFirstName("burhan");
        foundUser.setMiddleName("uno");
        foundUser.setLastName("erden");
        foundUser.setBirthDate(LocalDateTime.now());
        foundUser.setGender(EnumLibrary.Gender.ATTACK_HELICOPTER);
        userRepository.save(foundUser);
    }
}
