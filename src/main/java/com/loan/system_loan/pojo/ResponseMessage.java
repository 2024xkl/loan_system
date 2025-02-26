package com.loan.system_loan.pojo;

import org.springframework.http.HttpStatus;

public class ResponseMessage<T> {
    private Integer code;
    private String message;
    private T data;
    public ResponseMessage(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    //请求接口成功
    public static<T> ResponseMessage success(T data) {
        return new ResponseMessage(HttpStatus.OK.value(),"success!",data);

    }
    public static <T> ResponseMessage<T> error1(String message) {
        return new ResponseMessage<>(500, message, null);
    }
public static <T> ResponseMessage<T> error(String message, Integer code) {
    return new ResponseMessage<>(code, message, null);
}


    //请求接口成功
    public static<T> ResponseMessage success() {
        return new ResponseMessage(HttpStatus.OK.value(),"success!",null);

    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
