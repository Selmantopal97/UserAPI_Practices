package com.selman.app.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.selman.app.rest.Models.User;

public interface UserRepo extends JpaRepository<User, Long>{
    
}
