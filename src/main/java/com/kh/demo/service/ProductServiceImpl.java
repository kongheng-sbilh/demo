package com.kh.demo.service;

import com.kh.demo.error.RestClientCustomException;
import com.kh.demo.model.response.ProductResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    @Value("${END_POINT_URL.PRODUCT_LIST}")
    private String PRODUCT_LIST;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public ProductResponse getProducts() throws RestClientCustomException {
        try {
            return restTemplate.getForObject(PRODUCT_LIST, ProductResponse.class);
        } catch (Exception exception) {
            log.error("method: getProducts(); error: ", exception);
            throw new RestClientCustomException(exception);
        }
    }
}
