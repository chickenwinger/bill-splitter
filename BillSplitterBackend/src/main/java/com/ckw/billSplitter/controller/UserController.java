package com.ckw.billSplitter.controller;

import com.ckw.billSplitter.model.UserModel;
import com.ckw.billSplitter.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserModel> getAllBills() {
        return userService.getAllUsers();
    }

    @PostMapping
    public UserModel addUser(@RequestBody UserModel user) {
        System.out.println("Received user: " + user);
        return userService.addUser(user);
    }

}
