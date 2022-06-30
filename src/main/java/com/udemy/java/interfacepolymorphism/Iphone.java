package com.udemy.java.interfacepolymorphism;

public class Iphone implements Alarm{

    public void dial(){
        System.out.println("Calling 123 ...");
    }

    public void answerphone(){
        System.out.println("Hello");
    }

    public void setAlarm(){
        System.out.println("Iphone = Setting an alarm @7:30AM");
    }
}
