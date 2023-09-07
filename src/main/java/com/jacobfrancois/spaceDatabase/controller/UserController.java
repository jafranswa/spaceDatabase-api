package com.jacobfrancois.spaceDatabase.controller;

import com.jacobfrancois.spaceDatabase.models.User;
import com.jacobfrancois.spaceDatabase.repository.UserRepository;
import com.jacobfrancois.spaceDatabase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
public class UserController {
    
    final private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    //todo add validation
    @PostMapping("/user")
    User create(@RequestBody User newUser){
        return userService.save(newUser);
    }

    @GetMapping("/user")
    Iterable<User> findAll(){
        return userService.findAll();
    }

    @PutMapping("/user")
    User update(@RequestBody User user){
        return userService.update(user);
    }

    @DeleteMapping("/user/{id}")
    void delete(@PathVariable Integer id){
        userService.deleteById(id);
    }

    @GetMapping("/user/{id}")
    Optional<User> findById(@PathVariable Integer id){
        return userService.findById(id);
    }

}
