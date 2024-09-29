package com.ckw.billSplitter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ckw.billSplitter.model.BillModel;

public interface BillRepository extends JpaRepository<BillModel, Integer> {

}
