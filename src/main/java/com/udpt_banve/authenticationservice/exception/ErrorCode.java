package com.udpt_banve.authenticationservice.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized exception"),
    USER_EXISTED(1001, "User existed"),
    INVALID_USERNAME(1002, "Username must at least 4 characters"),
    INVALID_PASSWORD(1003, "Username must at least 6 characters"),
    INVALID_KEY(1004, "Invalid message key"),
    ;
    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
    private int code;
    private String message;
}
