package org.basic.java.string.lesson26.animals;

public class Animal {
    public String name = "Animal";          // доступен везде
    private String secret = "Hidden Info";  // доступен только внутри класса Animal
    protected int age = 5;                  // доступен в том же пакете и в подклассах
    String type = "Mammal";                 // доступен только в пакете

    public void showPublic() {
        System.out.println("Public method");
    }

    protected void showProtected() {
        System.out.println("Protected method");
    }

    void showDefault() {
        System.out.println("Default (package-private) method");
    }

    private void showPrivate() {
        System.out.println("Private method");
    }

    public void accessAll() {
        showPublic();
        showProtected();
        showDefault();
        showPrivate();
    }
}
