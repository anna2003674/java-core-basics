package org.basic.java.string;

import java.util.Arrays;

public class Mass {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = i * 10 + 1;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[0]);

        int[] numbers2 = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(numbers2));
        int[] numbers3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers3));
        System.out.println(" ");

        String[] str = new String[3];

        int[][] mass = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9, 10, 11}};
        System.out.println(mass[2][3]);
        System.out.println();

        String[][] strings = new String[2][3]; // 2 строки и 3 столбца

        int[][] mass2 = {{1, 2, 3, 44, 66, 22, 77, 44, 88},
                {4, 5, 6},
                {7, 8, 9, 10, 11}};

        for (int i = 0; i < mass2.length; i++) {
            for (int j = 0; j < mass2[i].length; j++) {
                System.out.print(mass2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
