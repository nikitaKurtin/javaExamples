package gof.creational.factory;


import gof.creational.factory.soldier.Rank;
import gof.creational.factory.soldier.Soldier;
import gof.creational.factory.soldier.SoldierFactory;

public class FactoryTest {
    public static void main(String[] args) {
        SoldierFactory factory = new SoldierFactory();

        Soldier soldi = factory.createSoldier("Simha", 64);
        Soldier kim = factory.createSoldier("Kim", 45);

        soldi.upRank(Rank.Rabat);
        kim.upRank(Rank.Samar);

        soldi.serve();
    }
}
