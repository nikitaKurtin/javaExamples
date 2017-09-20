package zoo2;

/**
 * Created by hackeru on 17/07/2017.
 */
public class Animal {

    protected boolean isAlive;
    //when some Animal born
    public Animal(){
        this.isAlive = true;
    }
    //when some Animal dies
    public void die(){
        this.isAlive = false;
    }

}
