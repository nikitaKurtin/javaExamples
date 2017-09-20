import java.util.List;
import java.util.Objects;

/**
 * Created by Nikita Kurtin on 21/08/2017.
 */
public class Tester {
    public static void main(String[] args) {

        /*
        //Example 1

        //Variable of type Elements
        Elements e;
        //store reference of AIR instance
        e = Elements.AIR;
        //change and store reference of FIRE instance
        e = Elements.FIRE;
        //Cannot assign to constants:
        //Elements.WATER = Elements.AIR;
        //Cannot instantiate enum -> the whole point is that all instances are defined ahead of time
        //e = new Elements();

        //Since every enum value - is a fixed instance, both give true:
        System.out.println(e == Elements.FIRE);//equality by pointer
        System.out.println(e.equals(Elements.FIRE));//equality by values

        /*
        //Example 2 - state machine
        Directions d = Directions.NORTH;
        switch (d){
            case WEST:
                System.out.println("Hear me roar!");
                break;
            case NORTH:
                System.out.println("...");//Winter is came
                break;
            case EAST:
                System.out.println("Tiqui");//Some place in the east
                break;
            case SOUTH:
                System.out.println("Dorn");
                break;
        }

        Week wd = Week.FRIDAY;
        switch (wd){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case SUNDAY:
                System.out.println("Working day");
                break;
            case SATURDAY:
                System.out.println("Shabbat");
            case FRIDAY:
                System.out.println("No work");
                break;
        }

        /*
        //Example 3 - singleton
        Singy s1 = Singy.INSTANCE;
        Singy s2 = Singy.INSTANCE;

        System.out.println(s1 == s2);
        s2.name = "Tom";
        System.out.println(s1.name);

        /*
        //Example 4 - exercise
        Directions.NORTH.saySlogan();

        /*
        //Example 5
        Dude.SOFTY.saySome();

        /*/
        //Example 6 - useful methods
        //Array of enum instances -> .values()
        System.out.println(Dude.values().length);
        for(Dude d : Dude.values()){
            System.out.println(d.name());//instance name
            d.saySome();//polymorphic call
        }
        //get enum instance by name
        try{
            Dude.valueOf("DIEHARD").saySome();
        }catch (NullPointerException | IllegalArgumentException e){
            e.printStackTrace();
        }
        
        //*/
    }
}
