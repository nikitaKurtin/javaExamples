package zoo5;

import another.NoiseMaker;

/**
 * Created by Nikita Kurtin on 24/07/2017.
 */
public abstract class Animal implements NoiseMaker{

    protected boolean isAlive;

    Animal(){
        this.isAlive = true;
    }

    public void die(){
        this.isAlive = false;
    }

}
