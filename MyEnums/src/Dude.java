/**
 * Created by Nikita Kurtin on 21/08/2017.
 */
public enum Dude implements Dudable {
    //three instances
    DIEHARD("Yippie Ki Yay"), SOFTY("buu"), GOODLAD("Have a nice day");
    //instance variable desc
    private String desc;
    //constructor
    private Dude(String desc){
        this.desc = desc;
    }
    //Overriding methods
    @Override
    public void saySome(){
        System.out.println(super.name()+" says: "+this.toString());
    }
    @Override
    public String toString() {
        return this.desc;
    }
}