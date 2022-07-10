package Creatures;

public class Bird extends Creature {

    public Bird() {
    }

    public Bird(String name, int age) {
        super(name, age);
    }

    public void fly () {
        System.out.println("Я умею летать!");
    }

}
