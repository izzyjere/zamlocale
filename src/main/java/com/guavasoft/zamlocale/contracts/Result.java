package com.guavasoft.zamlocale.contracts;

public class Result<T> {
    private Result(T data,String message,  boolean succeeded) {
        this.message = message;
        this.data = data;
        this.succeeded = succeeded;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public boolean isSucceeded() {
        return succeeded;
    }

    private final String message;
    private final T data;
    private final boolean succeeded;
    public static <T> Result<T> Success(T data, String message){
        return  new Result<>(data,message,true);
    }
    public static <T> Result<T> Failure(String message){
        return  new Result<>(null,message,false);
    }

}
