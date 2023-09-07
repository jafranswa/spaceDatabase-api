package com.jacobfrancois.spaceDatabase.repository;

import com.jacobfrancois.spaceDatabase.models.Permission;
import org.springframework.data.repository.CrudRepository;

public interface PermissionRepository extends CrudRepository<Permission, Integer> {
}
