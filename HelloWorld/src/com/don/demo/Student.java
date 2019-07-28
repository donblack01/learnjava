package com.don.demo;

public class Student{
    String name;
    private String  school;
    int age;

    public  void study(){
        System.out.println(this.name + "正在学习");
    }

    public void  setSchool(String name){
        this.school = name;
        study();
    }
    public String  getSchool(){
        return this.school;
    }
/**
 * 在同一个类中： 
对于静态方法，其他的静态或非静态方法都可以直接调用它。 
而对于非静态方法，其他的非静态方法是可以直接调用它的。但是其他静态方法只有通过对象才能调用它。

静态方法不能被非静态方法覆盖。
 */

/**
 * 不同的类之间:
 * 无论调用方法是非静态还是静态，如果被调用的方法是： 
    静态方法，则通过类名与对象都可以调（但通过对象的方式不建议使用，因为它属于非静态调用的方式） 
    非静态方法，则只能通过对象才可以调用它
 */

    public static void s1(){
        System.out.println("s1");
    }
    public void say1(){
        System.out.println("say1");
    }
    public void say(){
        s1();
        say1(); //调用say1方法
    }
    public static void mains() {
         s1();
         Test2 t = new Test2();
          t.say();
    }

}