package gang_of_four.creational.factory_method.soldier;

public abstract class Soldier {
    protected String name;
    protected Rank rank;

    public Soldier(String name) {
        this.name = name;
        this.rank = Rank.Turai;
    }

    public void upRank(Rank newRank) {
        rank = newRank;
    }

    public abstract void serve();

    abstract String getSoldierType();
}
