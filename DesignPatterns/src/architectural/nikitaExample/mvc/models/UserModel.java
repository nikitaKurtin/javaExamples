package architectural.nikitaExample.mvc.models;

import architectural.nikitaExample.conf.DB;

import java.util.ArrayList;

public class UserModel {
    private db db;//encapsulated to class
    UserModel(){//encapsulated to package
        db=new db();
    }
    //model instance methods - (what he does)
    void insertUser(String name){
        db.insertUser(name);
    }
    void updateUserById(String name, int id){
        db.updateUserById(name,id);
    }
    String getUserById(int id){
        return db.getUserById(id);
    }
    ArrayList<String> getAll(){
        return db.getAllUsers();
    }
    //encapsulated, composite connection -> (protected list)
    class db extends DB{
        //business logic
        void insertUser(String name){
            users.add(name);//append new user
        }
        void updateUserById(String name, int id){
            users.set(id,name);//update existing user
        }
        String getUserById(int id){
            return users.get(id);//get user
        }
        ArrayList<String>getAllUsers(){
            return users;//all current users
        }
    }
}