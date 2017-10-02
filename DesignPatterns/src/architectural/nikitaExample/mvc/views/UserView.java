package architectural.nikitaExample.mvc.views;

public class UserView extends View {
    private String user;//UserView IS View and HAS User
    UserView(String user){//encapsulated to package
        this.user=user;
        show();//auto call
    }
    @Override
    void show() {
        System.out.println("****************************");
        System.out.println("User: "+user);
        System.out.println("****************************");
    }
}