package com.bc.ipfs.ipfsserver.controller;

import lombok.Data;

@Data
public class ResponseData<T> {
    private Integer code;
    private T data;
    private String msg;

    public ResponseData(Integer code, T data, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public static <T> ResponseData<T> ok(T data) {
        return new ResponseData<T>(0, data, null);
    }

    public static <T> ResponseData<T> error(String msg) {
        return new ResponseData<T>(1, null, msg);
    }
}
