package com.kh.demo.service;

import com.kh.demo.error.RestClientCustomException;
import com.kh.demo.model.response.ProductResponse;

public interface ProductService {

    ProductResponse getProductList() throws RestClientCustomException;

}
