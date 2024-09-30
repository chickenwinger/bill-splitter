package com.ckw.billSplitter.controller;

import com.ckw.billSplitter.model.BillModel;
import com.ckw.billSplitter.service.BillService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ckw/bills")
public class BillController {
    private static final Logger logger = LoggerFactory.getLogger(BillController.class);

    @Autowired
    private BillService billService;

    @GetMapping
    public List<BillModel> getAllBills() {
        logger.info("OUTPUT BILL LIST");
        return billService.getAllBills();
    }

    @PostMapping("/add")
    public BillModel addBill(@RequestBody BillModel bill) {
        ObjectMapper objMap = new ObjectMapper();
        logger.info("REQUEST SENT: {}", displayBillAsJson(bill));
        return billService.addBill(bill);
    }

    public String displayBillAsJson(BillModel bill) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(bill);
        } catch (Exception e) {
            e.printStackTrace();
            return "Error converting object to JSON";
        }
    }


}
