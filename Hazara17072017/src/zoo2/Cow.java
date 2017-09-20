package zoo2;

/**
 * Created by hackeru on 17/07/2017.
 */
public class Cow extends Animal {

    public String giveMilk(){
        return this.isAlive ? "milk" : null;
    }

}
