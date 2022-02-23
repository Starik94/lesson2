package com.company;

import java.util.Scanner;

public class Namepain {
    public static void main(String[] args) {
        System.out.println("Hello <user>");
        System.out.println("Enter your name");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        System.out.println("Hello " + input);

    }

}
