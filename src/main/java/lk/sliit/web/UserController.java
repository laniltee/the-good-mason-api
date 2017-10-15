package lk.sliit.web;

import lk.sliit.domain.User;
import lk.sliit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Lanil Marasinghe on 15-Oct-17.
 */
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @PostMapping("/users")
    public User addNewUser(@Valid @RequestBody User user){
        return userRepository.save(user);
    }
}
