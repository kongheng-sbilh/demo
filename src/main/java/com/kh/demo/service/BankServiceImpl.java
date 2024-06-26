package com.kh.demo.service;

import com.kh.demo.error.RestClientCustomException;
import com.kh.demo.model.response.BankResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class BankServiceImpl implements BankService {

    @Value("${END_POINT_URL.BANK_LIST_FOR_SWIFT}")
    private String BANK_LIST_FOR_SWIFT;

    @Value("${END_POINT_URL.BANK_LIST_FOR_NCF}")
    private String BANK_LIST_FOR_NCF;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public BankResponse getBankListForSWIFT() throws RestClientCustomException {
        try {
            return restTemplate.getForObject(BANK_LIST_FOR_SWIFT, BankResponse.class);
        } catch (Exception exception) {
            log.error("method: getBankListForSWIFT(); error: ", exception);
            throw new RestClientCustomException(exception);
        }
    }

    @Override
    public BankResponse getBankListForNCS() throws RestClientCustomException {
        try {
            return restTemplate.getForObject(BANK_LIST_FOR_NCF, BankResponse.class);
        } catch (Exception exception) {
            log.error("method: getBankListForNCS(); error: ", exception);
            throw new RestClientCustomException(exception);
        }
    }
}
