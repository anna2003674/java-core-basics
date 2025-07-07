package org.basic.java.string.statictests;

public class StaticTest1 {
    public static void main(String[] args) {
        Human.description = "Nice";
        Human.getDescription();

        Human human1 = new Human("Bob", 20);
        human1.setName("Anna");
        human1.getAllFields();
        Human.printAllFields();

        Human human2 = new Human("Alex", 23);
        human2.getAllFields();

        Human.description = "Bad";
        Human.getDescription();
        human2.getAllFields();
        human1.getAllFields();

        System.out.println(Math.pow(2, 5));
        System.out.println(Math.PI);

        human1.printNumberOfPeople();
        human2.printNumberOfPeople();

        Human human3 = new Human("Dasha", 19);
        human1.printNumberOfPeople();
        human2.printNumberOfPeople();
        human3.printNumberOfPeople();

    }
}

class Human {
    private String name;
    private int age;
    public static String description;
    private static int countPeople;

    public static void getDescription() {
        System.out.println(description);
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void printNumberOfPeople() {
        System.out.println("Number of people is " + countPeople);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getAllFields() {
        System.out.println(name + " " + age + " " + description);
    }

    public static void printAllFields() {
        System.out.println();
    }
}
