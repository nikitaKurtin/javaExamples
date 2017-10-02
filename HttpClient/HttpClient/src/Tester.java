import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Tester {
    public static void main(String[] args) {
        try {

            //Example 1
            URL url = new URL("http://info.hackeruweb.co.il:80/index.php");
            /*
            HttpURLConnection c = (HttpURLConnection) url.openConnection();
            int sCode=c.getResponseCode();
            System.out.println("Status code: "+sCode);
            if(sCode==200){
                BufferedReader br = new BufferedReader(new InputStreamReader(c.getInputStream()));
                for(String line;(line=br.readLine())!=null;){//read line by line
                    System.out.println(line);//print each line
                }
                br.close();//close reader
            }
            //Example 2
            url=new URL("http://3.bp.blogspot.com/-t9e7S8huhaQ/VBMVN6CbNGI/AAAAAAAAA14/02am46_jiJM/s1600/Big_smile.png");
            InputStream is = url.openConnection().getInputStream();
            byte [] bufData = new byte[2048];//create array of bytes - in size of buffer
            FileOutputStream fos=new FileOutputStream("files/tmuna2.png");
            for(int readBytes;(readBytes=is.read(bufData))>=0;){//read portions of data
                fos.write(bufData,0,readBytes);//write each portion to file
            }
            fos.close();

            //Example 3 - Equivalent to Example 1
            System.out.println(new HttpRequest(url).prepare().sendAndReadString());
            //Example 4 - Equivalent to Example 2
            String imgUrl="http://3.bp.blogspot.com/-t9e7S8huhaQ/VBMVN6CbNGI/AAAAAAAAA14/02am46_jiJM/s1600/Big_smile.png";
            byte [] file = new HttpRequest(imgUrl).prepare().sendAndReadBytes();
            new FileOutputStream("files/tmuna3.png").write(file);
            /*/
            //Example 5 - Client for our HttpServer
            System.out.println(new HttpRequest("http://127.0.0.1:999/poster").prepare(HttpRequest.Method.POST).sendAndReadString());
            //*/

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}