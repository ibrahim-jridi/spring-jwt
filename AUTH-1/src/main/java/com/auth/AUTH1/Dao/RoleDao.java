package com.auth.AUTH1.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.auth.AUTH1.Entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
