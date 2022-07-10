package Creatures;

public class Fish extends Creature{

    public Fish() {
    }

    public Fish(String name, int age) {
        super(name, age);
    }

    public void swimming () {
        System.out.println("Я умею плавать!");
    }

}
