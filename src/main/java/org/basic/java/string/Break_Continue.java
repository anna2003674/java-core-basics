package org.basic.java.string;

public class Break_Continue {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i == 15) {
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Мы вышли из цикла");

        System.out.println(" ");

        for (int i2 = 0; i2 <= 15; i2++) {
            if (i2 % 2 == 0) {
                continue;
            }
            System.out.println(i2);
        }
    }
}
