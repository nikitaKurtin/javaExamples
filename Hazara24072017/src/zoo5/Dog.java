package zoo5;

/**
 * Created by Nikita Kurtin on 24/07/2017.
 */
public class Dog extends Animal{

    @Override
    public void makeNoise() {
        if(isAlive)System.out.println("Guau guau");
    }
}
