package com.kh.demo.controller;

import com.kh.demo.error.RestClientCustomException;
import com.kh.demo.model.response.BankResponse;
import com.kh.demo.model.response.ProductResponse;
import com.kh.demo.service.BankService;
import com.kh.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0.0")
public class DemoController {

    @Autowired
    private ProductService productService;

    @Autowired
    private BankService bankService;

    @GetMapping("/bank_list_for_swift")
    public BankResponse getBankListForSWIFT() throws RestClientCustomException {
        return bankService.getBankListForSWIFT();
    }

    @GetMapping("/bank_list_for_ncs")
    public BankResponse getBankListForNcS() throws RestClientCustomException {
        return bankService.getBankListForNCS();
    }

    @GetMapping("/products")
    public ProductResponse getProductList() throws RestClientCustomException {
        return productService.getProductList();
    }

}
