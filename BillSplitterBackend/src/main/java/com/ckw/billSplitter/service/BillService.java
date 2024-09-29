package com.ckw.billSplitter.service;

import com.ckw.billSplitter.model.BillModel;
import com.ckw.billSplitter.repository.BillRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    @Autowired
    private BillRepository billRepository;

    public List<BillModel> getAllBills() {
        return billRepository.findAll();
    }

    public BillModel addBill(BillModel bill) {
        return billRepository.save(bill);
    }

}
