package org.basic.java.string.interfaces;

public class Person implements Info {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println("Name is: " + name);
    }
}
