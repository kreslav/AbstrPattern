import Creatures.Animal;
import Creatures.Bird;
import Creatures.Fish;

public class AbstractFactory {

    public Animal createAnimal(String name, int age) {
        return  new Animal(name, age);
    }

    public Bird createBird(String name, int age) {
        return  new Bird(name, age);
    }
    public Fish createFish(String name, int age) {
        return  new Fish(name, age);
    }

}

