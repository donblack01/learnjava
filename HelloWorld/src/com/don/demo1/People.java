package com.don.demo1;

public class People{
 private String name;
 private int age;
 int price = 20;

 public People(){}
 public People(String name, int age){
     this.name = name;
     this.age = age;
 }


 public String getName(){
     return name;
 }
 public void setName(String name){
     this.name = name;
 }

 public int getAge(){
     return this.age;
 }
 public void setAge(int age){
     this.age =age ;
 }
  public void eat(){
      System.out.println("正在吃");
  }
}