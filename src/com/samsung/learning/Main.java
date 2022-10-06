package com.samsung.learning;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ggg = 2; // золотое сочетание клавиш shift+f6
        System.out.println(ggg);

        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextInt();
        double y = scanner.nextInt();

        String res = (y > 0 && x * x + y * y > 4 && x < 2 && y < x) ? "YES" : "NO";
    }
}
