import zoo5.*;
import another.*;

/**
 * Created by Nikita Kurtin on 24/07/2017.
 */
public class Tester {

    public static void main(String[] args) {
		//Example based on: https://www.youtube.com/watch?v=wPNQw8naE2Q
        Animal [] animals = {new Chick(), new Cat(), new Dog(), new Cow(), new Duck(), new Sheep()};
        for(Animal a: animals)a.makeNoise();

        Tractor t = new Tractor();
        Chick c = (Chick)animals[0];
        t.runOver(c);
        System.out.println("The chick didn't die");

        Cat c2 = (Cat)animals[1];
        c2.drink("milk");

        System.out.println("Happy end");
    }

}
