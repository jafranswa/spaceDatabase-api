package com.jacobfrancois.spaceDatabase.service;

import com.jacobfrancois.spaceDatabase.models.User;
import com.jacobfrancois.spaceDatabase.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    final private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // add not found validation
    public Optional<User> findById (Integer id) {
        return userRepository.findById(id);
    }

    public User update (User user) {
        return userRepository.save(user);
    }

    public User save (User newUser) {
        return userRepository.save(newUser);
    }

    public Iterable<User> findAll () {
       return userRepository.findAll();
    }

    public void deleteById (Integer id) {
        userRepository.deleteById(id);
    }
}
