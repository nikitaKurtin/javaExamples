import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Paveler {
    public static void main(String [] args){
        try{
            HttpServer server = HttpServer.create(new InetSocketAddress(999), 0);
            server.createContext("/hello",new HelloHandler());
            server.createContext("/poster",new PosterHandler());
            server.start();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}