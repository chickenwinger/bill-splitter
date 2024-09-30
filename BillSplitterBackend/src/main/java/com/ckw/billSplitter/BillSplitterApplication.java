package com.ckw.billSplitter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ckw.billSplitter")
public class BillSplitterApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillSplitterApplication.class, args);
	}

}
