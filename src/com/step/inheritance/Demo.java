package com.step.inheritance;

public class Demo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        Animal cat2 = new Cat(); //[Animal ] + cod Cat
        cat2.eat();

        Animal dog2 = new Dog();
        dog2.eat();



    }
}
