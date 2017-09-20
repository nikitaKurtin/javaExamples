package zoo2;

/**
 * Created by hackeru on 17/07/2017.
 */
public class Dog extends Animal {

    public void bark(){
        if(this.isAlive){
            System.out.println("Woof");
        }
    }

}
