package com.jacobfrancois.spaceDatabase.repository;

import com.jacobfrancois.spaceDatabase.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
