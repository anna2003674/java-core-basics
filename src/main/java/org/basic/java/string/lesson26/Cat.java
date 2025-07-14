package org.basic.java.string.lesson26;

import org.basic.java.string.lesson26.animals.Animal;

public class Cat extends Animal {
    public void test() {
        System.out.println(name);      // public — OK
        System.out.println(age);       // protected — OK (наследуется)
        // System.out.println(type);   // default — ошибка (другой пакет)
        // System.out.println(secret); // private — ошибка

        showPublic();     // OK
        showProtected();  // OK
        // showDefault(); // ошибка
        // showPrivate(); // ошибка
    }
}
