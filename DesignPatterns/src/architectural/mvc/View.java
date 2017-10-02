package architectural.mvc;

class View {

    void viewSoldier(SoldierModel soldier) {
        System.out.println(soldier.getName() + " with ID, " + soldier.getID());
    }
}
