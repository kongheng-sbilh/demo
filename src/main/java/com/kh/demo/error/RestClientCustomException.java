package com.kh.demo.error;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class RestClientCustomException extends Exception {

    public RestClientCustomException(String message) {
        super(message);
    }

    public RestClientCustomException(Throwable cause) {
        super(cause);
    }
}
