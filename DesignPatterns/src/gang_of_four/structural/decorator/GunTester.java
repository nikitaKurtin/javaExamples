package gang_of_four.structural.decorator;

public class GunTester {
    public static void main(String[] args) {
        Gun g = new Pistol();
        System.out.println(new WithLaser(g).getWeight());
    }
}
