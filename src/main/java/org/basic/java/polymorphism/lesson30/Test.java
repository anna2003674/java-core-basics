package org.basic.java.polymorphism.lesson30;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.eat();
        dog.eat();

        Animal animal1 = new Dog();
        Dog dog1 = new Dog();

        animal1.eat();
        // animal1.bark(); // так нельзя
        dog.eat();
        dog.bark();

        Animal animal3 = new Animal();
        Dog dog3 = new Dog();
        Cat cat3 = new Cat();

        test(animal3);
        test(dog3);
        test(cat3);
    }

    public static void test(Animal animal) {
        animal.eat();
    }
}
