import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map.Entry;

public class Ziser {
    private static final String dataFile="data/data.xml";//
    public static void main(String [] args)throws Exception{
        //Example 1
        readXmlFile("data/mods.xml");
        //Example 2
        HashMap<String,String[]>stuff = new HashMap();
        stuff.put("movie",new String[]{"Dr. Strange","Sully","Masterminds"});
        stuff.put("language",new String[]{"HTML","CSS","JavaScript","Java","Regex","XML"});
        stuff.put("food",new String[]{"Shnitzel","Phalaphel","Sandwich","Ice Cream","Pizza"});
        writeXmlFile("data/stuff.xml",stuff);
        //Example 3
        if(addUser("Katia")) System.out.println("Katia added");

    }
    static boolean addUser(String name){
        if(name==null || "".equals(name))return false;//negative flag to caller
        try{
            File f=new File(dataFile);//xml File object
            Document d = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(f);
            NodeList users = d.getElementsByTagName("user");
            for(int i=0 ; i<users.getLength() ; i++){
                if(name.equals(users.item(i).getTextContent()))return false;//user already exists - negative flag to caller
            }
            Node newUser=d.createElement("user");//Element object for newUser
            newUser.setTextContent(name);//add given name to newUser
            d.getElementsByTagName("users").item(0).appendChild(newUser);//add newUser to users element - Document manipulation
            Transformer t=TransformerFactory.newInstance().newTransformer();//Transform - to transform Document back to file
            t.transform(new DOMSource(d),new StreamResult(f));//transform -> writes
            return true;//positive flag to caller
        }catch (Exception e){
            e.printStackTrace();
            return false;//if failed - negative flag to caller
        }
    }
    static void writeXmlFile(String filePath, HashMap<String,String[]> data){
        try{
            StringBuilder xml=new StringBuilder("<map>\n");
            for(Entry<String,String[]> e:data.entrySet()){//iterate over all data
                String tagName=e.getKey();
                String [] elems=e.getValue();
                for(int i=0;i<elems.length;i++){//iterate over all elements of the same tagName
                    xml.append("\t<"+tagName+">").append(elems[i]).append("</"+tagName+">\n");
                }
            }
            xml.append("</map>");
            FileOutputStream fos = new FileOutputStream(filePath);
            fos.write(xml.toString().getBytes());
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    static void readXmlFile(String filePath){
        try {
            //byte [] data = Files.readAllBytes(Paths.get(filePath));
            //System.out.println(new String(data));
            //Use DocumentBuilder to create XML Document object
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            //Parse XML Document from file by path
            Document document = builder.parse(new File(filePath));
            //get all elements by tagName: "mod"
            NodeList mods = document.getElementsByTagName("mod");
            for(int i=0;i<mods.getLength();i++){//iterate over all mods
                System.out.println(mods.item(i).getTextContent());//print each textContent
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}