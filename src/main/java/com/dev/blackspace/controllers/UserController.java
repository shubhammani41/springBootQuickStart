package com.dev.blackspace.controllers;

import com.dev.blackspace.entities.UserProfileEntity;
import com.dev.blackspace.repositories.UserProfileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/public")
public class UserController {
    @Autowired
    private UserProfileRepo userProfileRepo;

    @GetMapping("/getUserList")
    public List<UserProfileEntity> getUserList(){
        return this.userProfileRepo.findAll();
    }
}
