package com.samsung.learning;
import com.samsung.learning.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ivan", 18);
        Person person1 = person;
        Person person2 = new Person(person);

        person.printInfo();

        person1.setAge(19);
        person2.setAge(19);

        System.out.println(person.getAge());
        System.out.println(person1.getAge());
        System.out.println(person2.getAge());
    }
}
