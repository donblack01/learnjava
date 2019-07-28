package com.don.demo;
public class Phone {
    String brand;
    String name;
    String model;



    public void call(String toUser){
   System.out.println("call to "+ toUser);
    }
    public void sendMessage(String toUser){
        System.out.println("sendMessage to "+ toUser);
    }

    public void playGames(){
        System.out.println("play Games");
    }
}