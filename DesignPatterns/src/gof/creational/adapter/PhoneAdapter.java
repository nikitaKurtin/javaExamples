package gof.creational.adapter;

public class PhoneAdapter implements Chargeable220 {
    private Chargeable3 charger3;

    public PhoneAdapter(Chargeable3 charger3) {
        this.charger3 = charger3;
    }

    @Override
    public void charge220Volts() {
        charger3.chargeWith3Volts();
    }
}
