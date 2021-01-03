package com.service;

public class AgeException extends Exception{
    @Override
    public String getMessage() {
        return "年龄不能为负值！";
    }
}
