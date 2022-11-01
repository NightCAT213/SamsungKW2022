package com.samsung.learning;

import com.samsung.learning.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Valera";
        person.age = 18;

        Person person1 = new Person();
        person1.name = "Kolya";
        person1.age = 14;
        // if private
        // Person person = new Person("Sasha", 17);

        person.printInfo();
        person.birthday();
        person.printInfo();

        person1.printInfo();

        // Integer
        Integer a = 1;
        String s = a.toString();
    }
}
