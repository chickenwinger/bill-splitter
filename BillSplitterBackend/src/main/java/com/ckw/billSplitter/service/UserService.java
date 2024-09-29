package com.ckw.billSplitter.service;

import com.ckw.billSplitter.model.BillModel;
import com.ckw.billSplitter.model.UserModel;
import com.ckw.billSplitter.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    public UserModel addUser(UserModel user) {
        return userRepository.save(user);
    }

}
