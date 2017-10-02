package architectural.mvc;

class MvcTest {
    public static void main(String[] args) {
        SoldierModel model = new SoldierModel();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.presentSoldier();

        controller.setModelID(10);
        controller.setModelName("John doe");
        controller.presentSoldier();


    }
}
