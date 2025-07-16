package lesson33;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.eat();

        Dog dog1 = new Dog();
        dog1.bark();
        dog1.eat();

        // Восходящее преобразование (upcasting)
        Animal animal = new Dog(); // собака рассматривается как животное
        animal.eat();

        Dog dog2 = new Dog();
        Animal animal2 = dog2;

        // Нисходящее преобразование (downcasting)
        Dog dog3 = (Dog) animal;
        dog3.bark();

        Animal a = new Animal();
        Dog dog = (Dog) a;
        // dog.bark();
    }
}
