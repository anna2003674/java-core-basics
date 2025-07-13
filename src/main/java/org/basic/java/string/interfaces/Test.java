package org.basic.java.string.interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        animal1.sleep();
        animal1.showInfo();

        Person person1 = new Person("Anna");
        person1.sayHello();
        person1.showInfo();

        Info info1 = new Animal(2);
        Info info2 = new Person("Bob");
        info1.showInfo();
        info2.showInfo();

        outputInfo(info1);
        outputInfo(info2);

        Animal animal3 = new Animal(333);
        Person person3 = new Person("Dasha");
        outputInfo(animal3);
        outputInfo(person3);
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
