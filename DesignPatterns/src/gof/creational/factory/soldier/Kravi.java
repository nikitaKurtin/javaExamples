package gof.creational.factory.soldier;

class Kravi extends Soldier {
    Kravi(String name) {
        super(name);
    }

    @Override
    public void serve() {
        System.out.println("Fighter fighting war with guns");
    }

    @Override
    String getSoldierType() {
        return "Kravi";
    }
}
