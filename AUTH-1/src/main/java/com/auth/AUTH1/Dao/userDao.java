package com.auth.AUTH1.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.auth.AUTH1.Entity.User;

@Repository
public interface userDao extends CrudRepository<User, String> {
}
