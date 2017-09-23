package gof.creational.Decorator_gun;

public class GunTester {
    public static void main(String[] args) {
        Gun g = new Pistol();
        System.out.println(new WithLaser(g).getWeight());
    }
}
