package org.basic.java.string;

public class Lesson23 {
    public static void main(String[] args) {
        String x1 = "Anna";
        String x2 = new String("Anna");

        x1.toUpperCase(); // ANNA
        System.out.println(x1); // Anna

        String string1 = "Hello ";
        String string2 = "my ";
        String string3 = "friend ";
        String stringAll = string1 + string2 + string3;
        System.out.println(stringAll);

        StringBuilder sb1 = new StringBuilder("Hello ");
        System.out.println(sb1.toString());
        sb1.append("my ").append("friend !");
        System.out.println(sb1.toString());

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);
    }
}
