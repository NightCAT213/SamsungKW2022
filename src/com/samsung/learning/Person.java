package com.samsung.learning;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person person) {
    }

    public void printInfo() {
        System.out.println(name);
        System.out.println(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }
}
