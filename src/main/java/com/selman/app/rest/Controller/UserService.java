package com.selman.app.rest.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.selman.app.rest.Models.User;
import com.selman.app.rest.Repo.UserRepo;

@Service
public class UserService {
    
     @Autowired
    private UserRepo userRepo;

    public Optional<User> getUserById(Long id) {
        return userRepo.findById(id);
    }
}