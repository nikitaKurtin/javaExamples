/**
 * Created by Nikita Kurtin on 21/08/2017.
 */
public enum Directions {
    NORTH, SOUTH, WEST, EAST;

    public void saySlogan(){
        switch (this){
            case NORTH:
                System.out.println("Winter is coming");
                break;
            case SOUTH:
                System.out.println("Unbowed, Unbent, Unbroken.");
                break;
            case WEST:
                System.out.println("Hear me roar");
                break;
            case EAST:
                System.out.println("Google - tiqui");
                break;
        }
    }
}
