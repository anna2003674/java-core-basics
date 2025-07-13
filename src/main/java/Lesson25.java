public class Lesson25 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.eat();
        animal1.sleep();

        Dog dog1 = new Dog();
        dog1.eat();
        dog1.sleep();
        dog1.bark();
        dog1.showName();
    }
}

class Animal {

    private String name = "Some animal";

    public void eat() {
        System.out.println("Animal am eating");
    }

    public void sleep() {
        System.out.println("Animal am sleeping");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


class Dog extends Animal {

    public void bark() {
        System.out.println("Dog am barking");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void showName() {
        System.out.println(getName());
    }
}
