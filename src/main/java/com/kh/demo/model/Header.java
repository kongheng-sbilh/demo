package com.kh.demo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Header {

    private Audit audit;

    private String page_start;

    private String page_token;

    private String total_size;

    private String page_size;

    private String status;

}
