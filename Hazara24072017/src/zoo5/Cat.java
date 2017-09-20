package zoo5;

/**
 * Created by Nikita Kurtin on 24/07/2017.
 */
public class Cat extends Animal {

    @Override
    public void makeNoise() {
        if(isAlive)System.out.println("Miao");
    }

    public void drink(String bev){
        if(isAlive){
            if("milk".equalsIgnoreCase(bev)){
                System.out.println("Cat gladly drinks "+bev);
                makeNoise();
            }else{
                System.out.println("Cat refuse to drink "+bev+" and probably won't talk to you anymore");
            }
        }
    }

    public void eat(Chick c){
        if(isAlive){
            System.out.println("Cat gladly eats the chick ");
            c.die();
        }
    }

}
