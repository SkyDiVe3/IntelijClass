package com.step.exercitiuPractic;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Mihai"));
        persons.add(new Person("Andrei"));
        persons.add(new Person("Grigore"));
        persons.add(new Person("Oleg"));
        persons.add(new Person("Ion"));

        Collection.sort(Person);
    }
}
