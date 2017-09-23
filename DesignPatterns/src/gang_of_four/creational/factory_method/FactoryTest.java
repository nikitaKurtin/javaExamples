package gang_of_four.creational.factory_method;


import gang_of_four.creational.factory_method.soldier.Rank;
import gang_of_four.creational.factory_method.soldier.Soldier;
import gang_of_four.creational.factory_method.soldier.SoldierFactory;

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
