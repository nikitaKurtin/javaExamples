package gof.creational.factory.soldier;

class Jobnik extends Soldier {

    Jobnik(String name) {
        super(name);
    }

    @Override
    public void serve() {
        System.out.println("Working on computer");
    }

    @Override
    String getSoldierType() {
        return "Jobnik";
    }
}
