package gof.creational.factory.soldier;

class Tomeh extends Soldier {
    Tomeh(String name) {
        super(name);
    }

    @Override
    public void serve() {
        System.out.println("Fighting wars with fighters");
    }

    @Override
    String getSoldierType() {
        return "Tomeh";
    }
}
