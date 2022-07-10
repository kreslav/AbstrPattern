import AbsractFactory.DollarsFactory;
import AbsractFactory.EuroFactory;
import AbsractFactory.MoneyFactory;
import AbsractFactory.RubbelesFactory;
import Creatures.Animal;
import Creatures.Bird;
import Creatures.Creature;
import Creatures.Fish;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        AbstractFactory factory = new AbstractFactory();
//
//        ArrayList<Creature> zoo = new ArrayList<Creature>();
//
//        Animal bear = factory.createAnimal("Bear", 2);
//        Bird sparrow = factory.createBird("Bird", 1);
//        Fish tuna = factory.createFish("Fish",2);
//
//        double random;
//
//        for (int i = 0; i < 15; i++) {
//            random = Math.random();
//            if(random < 0.2) {
//                zoo.add(factory.createFish("Fish", (int)(Math.random()*5)));
//            }
//            else {
//                if (random < 0.5) {
//                    zoo.add(factory.createAnimal("Bear",(int)(Math.random()*10)));
//                }
//                else {
//                    zoo.add(factory.createBird("Bird",(int)(Math.random()*3)));
//                }
//            }
//        }
//
//        for (Creature c : zoo) {
//            System.out.println(c.getName());
//        }

//        bear.running();
//        sparrow.fly();
//        tuna.swimming();
//
//        arr.add(bear);
//        arr.add(sparrow);
//        arr.add(tuna);
//
//        for (Creature c : arr) {
//            System.out.println(c.getName());
//        }

        MoneyFactory factoryR = new RubbelesFactory();
        factoryR.createCoin();
        factoryR.createPaper();

        MoneyFactory factoryD = new DollarsFactory();
        factoryD.createCoin();
        factoryD.createPaper();

        MoneyFactory factoryE = new EuroFactory();
        factoryE.createPaper();
        factoryE.createCoin();

    }
}
