package zoo2;

/**
 * Created by hackeru on 17/07/2017.
 */
public class Cat extends Animal {

    public void eat(Mouse m){
        if(this.isAlive){
            System.out.println("Cat eats the mouse");
            m.die();
        }
    }

    public void drink(String bev){
        if(this.isAlive){
           if("milk".equalsIgnoreCase(bev) || "water".equalsIgnoreCase(bev)){
               System.out.println("Cat gladly drinks "+bev);
           }else{
               System.out.println("Cat refuse to drink "+bev);
           }
        }
    }

}
