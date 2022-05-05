package com.company;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger log = Logger.getLogger("Main");
        Scanner kon = new Scanner(System.in);
        Scanner izm = new Scanner(System.in);
        System.out.println("Введите значение в КилоБайтах:");
        double kb = kon.nextDouble();
        System.out.println("Введите значение в Байтах:");
        double bb = izm.nextDouble();
        double kb1 = kb * 1024;
        System.out.println(kb + " Кб = " + kb1 + " Б");
        log.info("Кб");
        double bb1 = bb / 1024;
        System.out.println(bb + " Б = " + bb1 + " Кб");
        log.info("Б");

    }
}


