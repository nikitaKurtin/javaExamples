import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;

public class HelloHandler implements HttpHandler{
    private int status=200;//HTTP status code
    private byte [] response;//Response body
    public void handle(HttpExchange http) throws IOException {
        response="Hello world from server".getBytes();//Data contents - we want to send to client
        http.sendResponseHeaders(status,response.length);//headers -> basic data - about response
        http.getResponseBody().write(response);//Server OutputStream - is Client's InputStream
    }
}
