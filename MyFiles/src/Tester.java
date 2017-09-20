import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Nikita Kurtin on 14/08/2017.
 */
public class Tester {

    public static void main(String[] args) {


        try {
            //Example 1
            //Read all bytes from given path
            byte [] data = Files.readAllBytes(Paths.get("files/students.txt"));
            //*
            //convert array of bytes to String
            String students = new String(data);
            /*/
            System.out.println(students);
            String [] names = students.split(", ");
            for(int i=0;i<names.length;i++){
                System.out.println(i+" "+names[i]);
            }

            //Example 2
            //create file

            File f = new File("files/my.txt");
            f.createNewFile();

            //create directory
            new File("stas").mkdir();
            //check if file or directory exists
            if(!f.exists()) System.out.println("my file exists");

            //Example 3
            f.renameTo(new File("files/yours.txt"));
            /*

            //Example 4
            FileOutputStream fos = new FileOutputStream("files/bubu.txt");
            fos.write("Bubu is the king".getBytes());
            fos.close();

            //*/
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
        //Example 5 - using try with resources
        try(FileOutputStream fos = new FileOutputStream("files/enc2.txt");
            FileInputStream fis = new FileInputStream("files/students.txt")){
            //iterate byte by byte -> over FileInputStream
            for(int b; (b=fis.read()) > -1; ){
                fos.write(b ^ 5);//each byte -> write into FileOutputStream
            }
            //no need to call .close
            //because we use -> try with resources
        }catch (IOException e){
            e.printStackTrace();
        }

        encXor7("files/students.txt");

        //*/

        //Example 6
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("files/someText.txt")))){
             for(String line;(line = br.readLine()) != null;){
                 System.out.println(line.toLowerCase().replaceAll("crap|shit","****Censored****"));
             }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void encXor7(String path){
        String encFile=path.substring(path.lastIndexOf('/'));
        try(FileOutputStream fos = new FileOutputStream("enc"+encFile);
            FileInputStream fis = new FileInputStream(path)){
            for(int b; (b=fis.read()) > -1; ){
                fos.write(b ^ 7);//xor each byte with 7 -> 0b00000111
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
