package Creatures;

public class Animal extends Creature{
    public Animal() {
    }

    public Animal(String name, int age) {
        super(name, age);
    }

    public void running() {
        System.out.println("Я умею бегать!");
    }
}
