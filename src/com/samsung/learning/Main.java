package com.samsung.learning;

public class Main {
    public static void main(String[] args) {
        byte a = -128;
        short b = 20000;
        int c = 2000000;
        long d = 200000000l;
        System.out.println(a);

        float e = 1.636456565655555555555555555555555555555555555555555555f;
        double f = 1.5667675675675675676575;

        // а это комментарий
        boolean g = false;
        System.out.println(g);

        char s = 97; // только в одинарных кавычках
        System.out.println(s);

        System.out.println((char)(s + 1)); // приведение типов, унарная операция (когда только один аргумент)
        // приведение типов, то есть изменение типа

        int q = 1, w = 2;
        double res;

        res = w / q;

        System.out.println(res);

        res += 1;
        res -= 1;

        System.out.println((int) res);

        System.out.println(q++);
        System.out.println(q);

        System.out.println(++q);
        System.out.println(q);


        /* tyuytutu
        [p[[opoipipip
        а так многострочные кавычки пишутся*/
    }
}
