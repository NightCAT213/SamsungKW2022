package com.samsung.learning;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static Logger logger;

    public static void main(String[] args) {
        String str = "ferfe";
        String str1 = "ferfe";
        String str2 = new  String("ferfe");
        System.out.println(str == str2);  // сравнение кодов переменных
        System.out.println(str == str1);  // сравнение кодов переменных
        System.out.println(str.equals(str2));  // сравнение значений

        String[] arr = str.split("e");
        String str3 = str.replace("f", "j");
        System.out.println(arr[0]);
        System.out.println(str3);

        logger = Logger.getLogger(Main.class.getName());
        System.out.println(logger);
        logger.log(Level.WARNING, "Старт приложения");
        logger.log(Level.WARNING, "Конец приложения");
    }
}
