package com.samsung.learning;

public class HomePet {
    private String namea;
    private String namep;
    private String type;

    public HomePet(String namea, String namep, String type) {
        this.namea = namea;
        this.namep = namep;
        this.type = type;
    }

    public void printInfo() {
        System.out.println("Кличка питомца: " + namea);
        System.out.println("Имя хозяина: " + namep);
        System.out.println("Тип животного: " + type);
    }
}
