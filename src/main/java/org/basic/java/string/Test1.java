package org.basic.java.string;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("введите какое-то число ");
        int s1 = s.nextInt();
        System.out.println("Это число " + s1);

        // тут дублирование кода
        Scanner scanner = new Scanner(System.in);
        System.out.println("введи 5 ");
        int value = scanner.nextInt();
        while (value != 5) {
            System.out.println("введи 5 ");
            value = scanner.nextInt();
        }
        System.out.println("вы ввели 5");

        System.out.println("----------");

        int val;
        do {
            System.out.println("введи 5 ");
            val = scanner.nextInt();
        } while (val != 5);
        System.out.println("вы ввели 5");
    }
}
