package gang_of_four.structural.adapter;

public class PhoneCharger implements Chargeable3 {
    @Override
    public void chargeWith3Volts() {
        System.out.println("Charging phone with 3 volts");
    }
}
