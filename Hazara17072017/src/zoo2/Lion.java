package zoo2;

/**
 * Created by hackeru on 17/07/2017.
 */
public class Lion extends Animal {

    public void eat(Cow c){
        if(this.isAlive){
            System.out.println("The lion eats the cow");
            c.die();
        }
    }

}
