package org.basic.java.string;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.age = 21;
        person1.name = "Anna";

        Person person2 = new Person();
        person2.age = 19;
        person2.name = "Dasha";

        System.out.println("меня зовут " + person1.name + " мне " + person1.age + " лет");
        System.out.println("меня зовут " + person2.name + " мне " + person2.age + " лет");
    }
}

class Person {
    String name;
    int age;
}