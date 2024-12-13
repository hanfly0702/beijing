package com.hyf.assistant.exception;

public class ApiException extends BaseException {

    private Object data;

    public ApiException() {
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApiException(String status,String message) {
        super(status, message);
    }

    public ApiException(String status,String message, Throwable cause) {
        super(status, message, cause);
    }

    public ApiException(ErrorEnum errorEnum) {
        super(errorEnum.getCode(), errorEnum.getMessage());
    }

    public Object getData() {
        return data;
    }

    public ApiException setData(Object data) {
        this.data = data;
        return this;
    }
}
