package org.basic.java.string.lesson26.animals;

public class Dog {
    public void test() {
        Animal animal = new Animal();
        System.out.println(animal.name);     // public — OK
        System.out.println(animal.age);      // protected — OK (тот же пакет)
        System.out.println(animal.type);     // default — OK
        // System.out.println(animal.secret); // private — ошибка

        animal.showPublic();     // OK
        animal.showProtected();  // OK
        animal.showDefault();    // OK
        // animal.showPrivate(); // ошибка
    }
}
