package com.hyf.assistant.exception;

public abstract class BaseException extends RuntimeException {

    protected String status;

    public BaseException() {
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(String message,Throwable cause) {
        super(message,cause);
    }

    public BaseException(String status,String message) {
        super(message);
        this.status = status;
    }

    public BaseException(String status,String message, Throwable cause) {
        super(message, cause);
        this.status = status;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
