package com.kh.demo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Bank {

    private String piccd;

    private String country;

    private String bnkId;

    private String address;

    private String cityName;

    private String bankName;

    private String biccd;

    private String branchcd;

}
