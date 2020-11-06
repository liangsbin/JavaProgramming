/**
 * 包package的使用
 * package相当于创建一个文件夹，方便为程序归档、避免重名
 * package语句必须放在一个源文件第一行，并且只能有一个package语句。
 *
 * 编译和运行
 * javac -d directory Pakcage.java
 * java com.company.service.Package
 */
package com.company.service;

public class Package {  //Object
    String no;
    String name;
    String grade;

    public Package(){
        System.out.println("first Constructor");
    }

    public Package(String no, String name, String grade) {
        this.no = no;
        this.name = name;
        this.grade = grade;
        System.out.println("second constructor");
    }

    @Override
    public String toString() {
        return "Student{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

}
