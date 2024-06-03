package com.kh.demo.service;

import com.kh.demo.error.RestClientCustomException;
import com.kh.demo.model.response.BankResponse;

public interface BankService {

    BankResponse getBanks() throws RestClientCustomException;

}
