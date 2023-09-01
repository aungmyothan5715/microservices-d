package com.example.userservice.service;

import com.example.userservice.entity.User;
import com.example.userservice.repo.UserRepo;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    public User saveUser(User user) {
        return userRepo.save(user);
    }
    public List<User> findAllUser() {
        return userRepo.findAll();
    }
    public User findById(int id) {
        return userRepo.findById(id).orElseThrow();
    }
}
