package com.samsung.learning;

public class Main {
    public static void main(String[] args) {
        for (double i = 0; i < 100; i = i + 0.5) {
            System.out.println(i);
        }

        // бесконечный цикл
        /*for (;;) {
            System.out.println(1);
            if () break;
        }*/

        // массивы

        int[] array;
        array = new int[10]; // инициализация массива стандартными значениями определённого типа

        array[9] = 10;
        array[5] = -100;


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


        int[] array2 = new int[100];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 100);
            System.out.println(array2[i] + " ");
        }
    }
}
