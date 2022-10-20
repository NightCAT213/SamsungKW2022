package com.samsung.learning;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // в начале была задача

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }


        for (int i: array) { // для всех элементов из массива
            System.out.println(i);
        }


        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sum(a, b));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void printArray(int[] array) {
        System.out.println("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}
