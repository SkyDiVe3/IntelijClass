package com.step.dateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Person {
    private String name;
    private String surname;
    private String birthdate;

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;

    }
    public Person(String name, String surname, String birthdate){
        //...

    }
    public static void main(String[] args) {
        LocalDate.of(2020, Month.OCTOBER, 42);

    }
}
