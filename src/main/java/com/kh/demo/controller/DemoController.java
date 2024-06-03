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

    @GetMapping("/banks")
    public BankResponse getBanks() throws RestClientCustomException {
        return bankService.getBanks();
    }

    @GetMapping("/products")
    public ProductResponse getProducts() throws RestClientCustomException {
        return productService.getProducts();
    }

}
