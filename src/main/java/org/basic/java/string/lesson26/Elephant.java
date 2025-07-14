package org.basic.java.string.lesson26;

import org.basic.java.string.lesson26.animals.Animal;

public class Elephant {
    public void test() {
        Animal animal = new Animal();
        System.out.println(animal.name);     // public — OK
        // System.out.println(animal.age);   // protected — ошибка
        // System.out.println(animal.type);  // default — ошибка
        // System.out.println(animal.secret);// private — ошибка

        animal.showPublic();     // OK
        // animal.showProtected(); // ошибка
        // animal.showDefault();   // ошибка
        // animal.showPrivate();   // ошибка
    }
}
