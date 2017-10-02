import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Katier {
    static final String usersFile="files/users.json";
    public static void main(String [] bubu){
        try {
            //Example 1 - read JSON
            User user=getUser("files/myUser.json");
            System.out.println(user.name);
            //Example 2 - Write JSON
            saveUserJson(user,false);
            //Example 3 - Data management
            addUser(new User("Drax",40,true));
            //Example 4 - Opt___ properties
            JSONObject obj = loadJson("files/myUser.json");
            String name = obj.optString("name");//returns String OR null(if not exists)
            if(name!=null){//exists
                System.out.println("user name is: "+name);
            }
            name = obj.optString("name","incognito");//return String OR defaultValue("incognito")
            System.out.println("user name is: "+name);
            //Example 5 - Load JSONObject from remote server
            String url = "http://nikita.hackeruweb.co.il/hackDroid/items.json";
            readItemsFromUrl(url);


        } catch (Exception e){
            e.printStackTrace();
        }
    }
    //read all item from given url
    private static void readItemsFromUrl(String url)throws IOException,JSONException{
        JSONObject obj = new HttpRequest(url).prepare().sendAndReadJSON();
        JSONArray hits = obj.getJSONArray("hits");//get Array of hits
        for(int i=0;i<hits.length();i++){//iterate over all hits
            JSONObject info = hits.getJSONObject(i).getJSONObject("_source").getJSONObject("info");//container of : name & icon
            String name = info.optString("name","some Item");//get name OR use "some Item" as default
            System.out.println("Item name: "+name);//print each name
            String icon=info.optString("icon");//returns null if not exists
            if(icon!=null)download(icon);//if icon exists - download it
        }
    }
    //downloads file to "files/" folder from given url
    private static void download(String url)throws IOException{
        byte [] data = new HttpRequest(url).prepare().sendAndReadBytes();//get file contents from url
        String downloadName="files/"+url.substring(url.lastIndexOf("/"));//generate download file name
        FileOutputStream fos = new FileOutputStream(downloadName);//save it
        fos.write(data);
        fos.close();
    }

    //Load JSONObject created from file by given path
    private static JSONObject loadJson(String fromFile)throws IOException,JSONException{
        return new JSONObject(new String(Files.readAllBytes(Paths.get(fromFile))));
    }
    //Adds given User - if not null & not exists
    private static void addUser(User u)throws IOException,JSONException{
        if(u!=null){//valid User
            JSONObject obj = loadJson(usersFile);//load JSONObject from file
            JSONArray users = obj.getJSONArray("users");
            for(int i=0;i<users.length();i++){
                if(users.getJSONObject(i).getString("name").equals(u.name))return;//if found -> get out
            }
            JSONObject addedUser=new JSONObject();//create JSONObject for User
            addedUser.put("name",u.name).put("isMarried",u.isMarried).put("age",u.age);//build user object
            users.put(addedUser);//add user to users array
            obj.put("users",users);//put users array back to root object
            new FileOutputStream(usersFile).write(obj.toString().getBytes());//write back to file
        }
    }
    //Creates User object from file by path
    private static User getUser(String fromFile)throws IOException,JSONException{
        JSONObject user = loadJson(fromFile);
        return new User(user.getString("name"), user.getInt("age"), user.getBoolean("isMarried"));
    }
    //Creates JSON file with given data
    private static void saveUserJson(User u,boolean isAdmin)throws IOException,JSONException{
        JSONObject session = new JSONObject();
        //add property to json
        session.put("isAdmin",isAdmin);
        //Built with Builder pattern - so methods can be chained:
        session.put("connectedAs",u.name).put("lastLogin",System.currentTimeMillis());
        new FileOutputStream("files/"+u.name+".json").write(session.toString().getBytes());
    }
}