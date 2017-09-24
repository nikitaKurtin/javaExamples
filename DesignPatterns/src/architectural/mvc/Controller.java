package architectural.mvc;

class Controller {
    private View view;
    private SoldierModel model;

    Controller(SoldierModel model, View view) {
        this.model = model;
        this.view = view;
    }

    public void setView(View view) {
        this.view = view;
    }

    void setModelName(String name) {
        model.setName(name);
    }

    void setModelID(int ID) {
        model.setID(ID);
    }

    void presentSoldier() {
        view.viewSoldier(model);
    }
}
