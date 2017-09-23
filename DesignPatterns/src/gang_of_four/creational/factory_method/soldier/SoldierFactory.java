package gang_of_four.creational.factory_method.soldier;

public class SoldierFactory {
    public Soldier createSoldier(String name, int profile) {
        switch (profile) {
            case 97:
                return new Kravi(name);
            case 82:
            case 72:
                return new Tomeh(name);
            case 64:
            case 45:
            case 24:
                return new Jobnik(name);
            case 21:
                throw new RuntimeException("can be with profile 21");
            default:
                return new Jobnik(name);
        }
    }
}
