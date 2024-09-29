package com.ckw.billSplitter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ckw.billSplitter.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Integer> {
    
}
