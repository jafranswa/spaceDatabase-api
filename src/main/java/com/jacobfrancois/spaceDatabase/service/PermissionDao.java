package com.jacobfrancois.spaceDatabase.service;

import com.jacobfrancois.spaceDatabase.models.Permission;
import org.springframework.data.repository.CrudRepository;

public interface PermissionDao extends CrudRepository<Permission, Integer> {
}
