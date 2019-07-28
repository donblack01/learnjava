package com.don.demo;

public class TestStudent{

    public static void main(String[] args) {
        Student xiaomin  = new Student();
        xiaomin.name = "张三";
        xiaomin.age = 13;
        xiaomin.study();
        xiaomin.setSchool("三中");
        System.out.println(xiaomin.getSchool());
        showAge(xiaomin);
    System.out.println(xiaomin.name);
    }

    public static void showAge(Student stu){
        System.out.println("学生"+stu.name+"的年龄是"+ stu.age);
        stu.name = "王五";
    }
}