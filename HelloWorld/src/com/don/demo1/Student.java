package com.don.demo1;
/**
 * 继承
 */
public class Student extends People{
int price = 10;


public void printPrice(){
    int price = 50;

    System.out.println("父级"+ super.price);
    System.out.println("子级"+ this.price);
    System.out.println("局部"+price );
}
}