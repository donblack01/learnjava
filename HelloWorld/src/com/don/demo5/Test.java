package com.don.demo5;
/**
 * 多态
 */
public class Test{
    public static void main(String[] args) {
        Animal an = new Dog();
        an.setName("张三");
        an.eat();
        //showAnimal(an);
        //an.jiao(); 报错
        System.out.println( an.getName());
    }

    public static void showAnimal(Animal an){
        an.eat();
    }
}