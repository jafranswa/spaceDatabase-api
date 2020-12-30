package com.jacobfrancois.spaceDatabase.service;

import com.jacobfrancois.spaceDatabase.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {

}
