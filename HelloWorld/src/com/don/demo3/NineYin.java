package com.don.demo3;
public class NineYin extends Martial{


    public NineYin(){
        super(n);
        System.out.println("nineyin 中的构造方法");
    }
    public NineYin(int n){
        System.out.println("nineyin 中的构造方法1");
    }
    public void internalStrength(){
        super.internalStrength();
        System.out.println("NineYin 的 internalStrength");
    }

    public void stroke(){
        super.stroke();
        System.out.println("NineYin 的 stroke");

    }
}