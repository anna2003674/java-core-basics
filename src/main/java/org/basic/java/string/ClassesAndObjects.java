package org.basic.java.string;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setAge(21);
        person1.setName("Anna");
        person1.speak();
        person1.sayHello();
        person1.calculateYearsToRetirement();

        int year1 = person1.calculateYearsToRetirement2();
        System.out.println(year1);

        Person person2 = new Person();
        person2.setNameAndAge("Dasha", 19);
        person2.speak();
        person2.sayHello();
        person2.calculateYearsToRetirement();

        int year2 = person2.calculateYearsToRetirement2();
        System.out.println(year2);
    }
}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Ты ввел пустое имя");
        } else {
            this.name = name;
        }
    }

    void setAge(int age) {
        if (age < 0) {
            System.out.println("Возраст должен быть положительным");
        } else {
            this.age = age;
        }
    }

    void setNameAndAge(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void calculateYearsToRetirement() {
        int years = 65 - age;
        System.out.println("Количество дней до пенсии: " + years);
    }

    int calculateYearsToRetirement2() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ", мне " + age + " лет");
        }
    }

    void sayHello() {
        System.out.println("Привет!!!");
    }
}