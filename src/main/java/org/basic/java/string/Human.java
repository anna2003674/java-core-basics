package org.basic.java.string;

class Lesson19 {
    public static void main(String[] args) {
        Human human1 = new Human("Kolya", 55);
        human1.getInfo();
    }
}

public class Human {
    private String name;
    private int age;

    public Human() {
        System.out.println("Привет из первого конструктора");
    }

    public Human(String name) {
        System.out.println("Привет из второго конструктора");
        this.name = name;
    }

    public Human(int age) {
        System.out.println("Привет из третьего конструктора");
        this.age = age;
    }

    public Human(String name, int age) {
        System.out.println("Привет из четвертого конструктора");
        this.name = name;
        this.age = age;
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

    public void getInfo() {
        System.out.println(name + ", " + age);
    }
}
