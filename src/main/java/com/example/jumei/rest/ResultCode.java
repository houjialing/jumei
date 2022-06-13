package com.example.jumei.rest;

/**
 * Author: 侯家领
 * Date: 2022-06-12 16:01
 */
public enum ResultCode {
    SUCCESS(200, "请求成功"), FAILURE(500, "请求失败");
    private final Integer code;
    private final String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
