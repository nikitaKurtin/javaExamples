package gof.behavioral.mediator;

public class MediatorTest {
    public static void main(String[] args) {
        Mediator ctrlTower = new Mediator();
        AirCraft f16 = new AirCraft("F16", ctrlTower);
        AirCraft f15 = new AirCraft("F15", ctrlTower);
        AirCraft f22 = new AirCraft("F22", ctrlTower);
        AirCraft mig = new AirCraft("Mig", ctrlTower);

        mig.sendMessage("Hello");
        AirCraft stealth = new AirCraft("incognito", ctrlTower);
        mig.sendMessage("I am groot");
    }
}
