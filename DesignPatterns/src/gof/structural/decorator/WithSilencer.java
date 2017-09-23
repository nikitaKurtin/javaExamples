package gof.structural.decorator;

public class WithSilencer extends Gun {
    private Gun gun;

    public WithSilencer(Gun gun) {
        this.gun = gun;
    }

    @Override
    public double getLoadTime() {
        return gun.getLoadTime();
    }

    @Override
    public double getPrecision() {
        return gun.getPrecision();
    }

    @Override
    public double getWeight() {
        return gun.getWeight() + 2.75;
    }

    @Override
    public double getFirePower() {
        return gun.getFirePower() - 1.5;
    }
}
