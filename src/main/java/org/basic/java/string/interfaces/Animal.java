package org.basic.java.string.interfaces;

public class Animal implements Info {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("I am sleeping");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void showInfo() {
        System.out.println("Id is: " + id);
    }
}
