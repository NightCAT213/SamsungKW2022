package com.samsung.learning;
import com.samsung.learning.HomePet;

public class Sr {
    public static void main(String[] args) {
        HomePet homepet = new HomePet("Жучка", "Коля", "мышь");
        HomePet homepet2 = new HomePet("Кот", "Саша", "пес");

        homepet.printInfo();
        homepet2.printInfo();
    }
}
