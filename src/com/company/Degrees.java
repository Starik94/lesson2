package com.company;

import java.util.Scanner;

public class Degrees {

    public static void main(String[] args) {
        System.out.println("Вас приветсвует конвертер температур по имени Артур. Введите любое значение по Цельсию");
        Scanner in = new Scanner(System.in);
        Scanner finish = new Scanner(System.in);
        int num;
        num = in.nextInt();
        for (; ; ) {
            System.out.println(num * 1.8 + 32 + " °F");
            System.out.println("Продолжим? Если да, введите любое значение по Цельсию. Если нет, напишите Exit");
            String b = finish.next();
            switch (b) {
                case "Exit" -> {
                    System.out.println("До свидания");
                    return;
                }
                default -> {
                    num = Integer.parseInt(b);
                }
            }

        }
    }
}