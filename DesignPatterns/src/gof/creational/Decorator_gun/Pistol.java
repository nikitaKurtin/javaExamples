package gof.creational.Decorator_gun;

public class Pistol extends Gun {

    @Override
    public double getLoadTime() {
        return 2.0;
    }

    @Override
    public double getPrecision() {
        return 3.0;
    }

    @Override
    public double getWeight() {
        return 3.5;
    }

    @Override
    public double getFirePower() {
        return 3.0;
    }
}
