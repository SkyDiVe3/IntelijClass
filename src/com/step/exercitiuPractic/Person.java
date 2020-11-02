package com.step.exercitiuPractic;

import java.time.LocalDate;

import java.util.Comparator;

class Person implements Comparator<Person> {
    String name;
    LocalDate birthdate;
    public Person(String name){
        this.name = name ;
        birthdate = LocalDate.now();
    }

    public String getName(){
        return this.name;
    }

    public LocalDate getBirthdate(){
        return this.birthdate;
    }

    public String compare(Person p1,Person p2){
        if (p1.getName() == p2.getName()) {
            return 0;
        } else if (p1.getName() > p2.getName()) {
            return 1;
        } else {
            return -1;
        }

    }
}
