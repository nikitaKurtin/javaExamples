package architectural.nikitaExample.mvc.views;

import java.util.ArrayList;

public class AllView extends View {
    private ArrayList <String> data;//any data (not only users)
    private String dataName;//name of data (for example: "user")
    AllView(ArrayList <String> data){//encapsulated to package
        this(data,"result");//default data name: "result"
    }
    AllView(ArrayList <String> data, String dataName){//encapsulated to package
        this.data=data;
        this.dataName=dataName;
        show();//auto - call
    }
    @Override
    void show() {
        System.out.println("*********** "+data.size()+" "+dataName+"s: ************");
        for (int i=0;i<data.size();i++) System.out.println(dataName+" "+i+": "+data.get(i));
        System.out.println("*************************************************");
    }
}
