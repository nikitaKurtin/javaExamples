package gang_of_four.creational.factory_method.soldier;

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
