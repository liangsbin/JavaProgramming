package com.service;

public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeException{
        AgeException ae = new AgeException();
        if(age < 0)
            throw ae;//使用throw主动的抛出异常对象
        else
            this.age = age;
    }

    public void print(){
        System.out.println("Name:" + this.name + ",Age:" + this.age);
    }

    public static void main(String[] args) {
        User user = new User();
        user.setName("zhangsan");
        try{
            user.setAge(-20);
        }catch (AgeException e){
            System.err.println(e.getMessage()); //标准错误输出
        }
        user.print();
    }
}
