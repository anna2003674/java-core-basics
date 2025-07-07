package org.basic.java.string;

public class Lesson22 {
    public static void main(String[] args) {
        final int X = 10;
        System.out.println(X);
        // X = 100; // Значение нельзя изменить после присваивания

        final MyClass obj = new MyClass();
        obj.setName("Anna"); // OK — изменяем содержимое объекта
        obj.setName("Masha"); // OK — изменяем содержимое объекта
        // obj = new MyClass(); // Ошибка — нельзя изменить ссылку
    }

    void method() {
        final int a = 5;
        // a = 10; // Ошибка
    }
}

class Test {
    public static final int CONSTANT = 10;
}

class MyClass {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
}

class Parent {
    public final void show() {
        System.out.println("Привет!");
    }
}

class Child extends Parent {
    // public void show() { } // Ошибка — нельзя переопределить
}


final class Animal {
}

// class Dog extends Animal { } // Ошибка — нельзя наследовать
