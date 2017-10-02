package architectural.nikitaExample.mvc.controllers;

public class UserController {
    private UserModel model;//encapsulated to UserController
    public UserController(){//accessible to Caller
        model=new UserModel();
    }
    //encapsulated to controller
    private String getStudentById(int id){
        return model.getUserById(id);
    }
    //pass data through controller
    public void createUser(String name){
        model.insertUser(name);
    }
    //pass updating data user through controller
    public void changeNameById(String name, int id){
        model.updateUserById(name,id);
    }
    //reveal the view by current data
    public void showUser(int id){
        new UserView(getStudentById(id));
    }
    //present all users data in AllView - dataName: "User"
    public void showAll(){
        new AllView(model.getAll(),"User");
    }
}
