package com.kh.demo.model;

import lombok.Data;

@Data
public class ResponseWrapper<T> {

    private Header header;

    private T[] body;
}
