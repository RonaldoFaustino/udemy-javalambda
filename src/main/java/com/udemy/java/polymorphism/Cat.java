package com.udemy.java.polymorphism;

public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("Ração para Gato");
    }

    @Override
    public void makeSound(){
        System.out.println("I am cat. meow....");
    }

}
