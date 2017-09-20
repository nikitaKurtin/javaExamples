package another;

import zoo5.Chick;

/**
 * Created by Nikita Kurtin on 24/07/2017.
 */
public class Tractor implements NoiseMaker {

    @Override
    public void makeNoise() {
        System.out.println("Brum Brum");
    }

    public void runOver(Chick c){
        System.out.println("Tractor ran over the chick");
    }

}
