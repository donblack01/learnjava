package com.don.demo;
/**
 * 实例调用手机类
 */
public class TestPhone{
    public static void main(String[] args) {
         Phone p = new Phone();
         p.brand = "apple";
         p.name = "x";
         p.name = "程序狗";
         System.out.println(p.brand);
         System.out.println(p.name);
         System.out.println(p.model);

         p.call("张三");
         p.sendMessage("李四");
         p.playGames();
    }
}