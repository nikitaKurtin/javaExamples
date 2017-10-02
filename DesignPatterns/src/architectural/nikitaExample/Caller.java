package architectural.nikitaExample;

import architectural.nikitaExample.mvc.controllers.UserController;

public class Caller {
    public static void main(String[] args) {
        UserController ctrl = new UserController();
        ctrl.createUser("Shiri");
        ctrl.createUser("Benny");
        ctrl.createUser("Shiran");
        ctrl.createUser("Maor");
        ctrl.createUser("Asaf");
        ctrl.createUser("Misha");
        ctrl.createUser("Pavel");
        ctrl.createUser("Tamar");
        //ctrl.showUser(3);
        ctrl.showAll();
    }
}