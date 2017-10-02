import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PosterHandler implements HttpHandler {
    private static final String conFile="files/log.txt";//filePath to connections log
    private int status=400;//default status
    private byte [] response="Bad request".getBytes();//default response
    public void handle(HttpExchange http) throws IOException {
        if(http.getRequestMethod().equalsIgnoreCase("POST")){
             //Each connection text: "from remAddr at timestamp;"
             String newTxt="from "+http.getRemoteAddress()+" at "+System.currentTimeMillis()+";\n";
             newTxt = lastConnections()+newTxt;//concat to existing log.txt contents
             FileOutputStream fos = new FileOutputStream(conFile);
             fos.write(newTxt.getBytes());//write back to conFile
             fos.close();
             status=200;//success status
             response="Thank you".getBytes();//success response
        }
        http.sendResponseHeaders(status,response.length);
        http.getResponseBody().write(response);
    }

    private String lastConnections(){
        try {//returns String contents of log.txt
            return new String(Files.readAllBytes(Paths.get(conFile)));
        }catch (IOException e){//OR empty string
            return "";
        }
    }
}
