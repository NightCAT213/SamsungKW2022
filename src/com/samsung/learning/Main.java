package com.samsung.learning;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("");

        System.out.print("ddeded");
        System.out.print("ddeded\n");
        System.out.print("ddeded\n");

        double adouble = 3.1432323232233232;
        System.out.printf("%.5f\n", adouble);
        System.out.printf("3 знака: %.3f | 5 знаков: %.5f", adouble, adouble);


        int n = scanner.nextInt();

        while (n < 100) {
            System.out.println(n);
            n++;
        }

        do {
            System.out.println(n);
        } while (n < 100);*/


        // задача
        int n = 0;
        int count = 0;

        do {
            n = scanner.nextInt();
            count++;
        } while (n >= 0);
        System.out.println(count);



        // continue переходит на следующую итерацию, не выполняя ту часть программы, идущую после continue

        // Math.random() выдает рандомное число от 0 до 1, не включая 1

        // break завершает цикл
    }
}
