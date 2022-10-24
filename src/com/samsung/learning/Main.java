package com.samsung.learning;

public class Main {
    public static void main(String[] args) {
        int arr2[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(arr2[1][2]);


        int[][] arr = new int[5][4];
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[j].length; i++) {
                arr[j][i] = (int) (Math.random() * 100);
            }
        }
        for (int j = 0;  j < arr.length; j++) {
            for (int i = 0; i < arr[j].length; i++) {
                System.out.print(arr[j][i] + "\t");
            }
            System.out.println("\n");
        }
        for (int i = 0; i < arr[i].length; i++) {
            System.out.print(arr[i][i] + " ");
        }
    }
}
