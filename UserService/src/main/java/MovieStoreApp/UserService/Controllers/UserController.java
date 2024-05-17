package MovieStoreApp.UserService.Controllers;

import MovieStoreApp.UserService.Entities.User;
import MovieStoreApp.UserService.Services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{userId}")
    public User getOneUser(@PathVariable Long userId){
        return userService.getOneUserById(userId);
    }

    @PostMapping
    public User createUser(@RequestBody User newUser){
        return userService.createOneUser(newUser);
    }

    @PutMapping("/{userId}")
    public User updateOneUser(@PathVariable Long userId, @RequestBody User newUser){
        return  userService.updateOneUserById(userId, newUser);
    }

    @DeleteMapping("/{userId}")
    public void deleteOneUser(@PathVariable Long userId){
        userService.deleteOneUserById(userId);
    }

}
