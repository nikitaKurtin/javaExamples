package gof.creational.adapter;

class WallReceiver {

    void charge220Volts(Chargeable220 charger) {
        System.out.print("charging 220v:\n\t");
        charger.charge220Volts();
    }
}
