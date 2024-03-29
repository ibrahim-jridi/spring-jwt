package com.auth.AUTH1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth.AUTH1.Dao.RoleDao;
import com.auth.AUTH1.Entity.Role;

@Service
public class RoleService {
	   @Autowired
	    private RoleDao roleDao;

	    public Role createNewRole(Role role) {
	        return roleDao.save(role);
	    }
}
