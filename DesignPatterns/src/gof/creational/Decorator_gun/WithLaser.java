package gof.creational.Decorator_gun;

public class WithLaser extends Gun {
    private Gun gun;

    public WithLaser(Gun gun) {
        this.gun = gun;
    }

    @Override
    public double getLoadTime() {
        return gun.getLoadTime();
    }

    @Override
    public double getPrecision() {
        return gun.getPrecision() + 5;
    }

    @Override
    public double getWeight() {
        return gun.getWeight() + 2;
    }

    @Override
    public double getFirePower() {
        return gun.getFirePower();
    }
}
