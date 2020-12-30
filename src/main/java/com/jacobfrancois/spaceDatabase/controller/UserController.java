package com.jacobfrancois.spaceDatabase.controller;

import com.jacobfrancois.spaceDatabase.models.User;
import com.jacobfrancois.spaceDatabase.service.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserDao userDao;

    //todo add validation
    @PostMapping("/user")
    User createUser(@RequestBody User newUser){
        return userDao.save(newUser);
    }

    @GetMapping("/user")
    Iterable<User> findAllUsers(){
        return userDao.findAll();
    }

    @PutMapping("/user")
    User updateDog(@RequestBody User aUser){
        return userDao.save(aUser);
    }

    @DeleteMapping("/user/{id}")
    void deleteDog(@PathVariable Integer id){
        userDao.deleteById(id);
    }

    @GetMapping("/user/{id}")
    Optional<User> findById(@PathVariable Integer id){
        return userDao.findById(id);
    }

}
