import java.io.*;

/**
 * Created by Nikita Kurtin on 17/08/2017.
 */
public final class FileEncrypter implements Runnable{
    private final String path;//path for file - to be encrypted
    private int xor;//xor to encrypt with
    private boolean validToRun;
    public FileEncrypter(String path){//dependency injection for path
        this.path = path;
    }
    //encrypt with given xor
    public void encrypt(int xor) throws FileNotFoundException {
        //basic validations
        if(xor < 0)throw new IllegalArgumentException("XOR must to be positive integer");
        if(path == null)throw new NullPointerException("path cannot be null");
        if(!new File(path).exists())throw new FileNotFoundException("No file found at: "+path);
        this.xor = xor;
        this.validToRun = true;
        new Thread(this).start();//if no exception thrown -> activate in background
    }
    //get path to encrypted file
    private String encFilePath(){
        return "enc"+path.substring(path.lastIndexOf('/'));
    }
    @Override
    public void run() {
        if(validToRun){
            try(FileOutputStream fos = new FileOutputStream(encFilePath());
                FileInputStream fis = new FileInputStream(path)){
                for(int b; (b=fis.read()) > -1; ){
                    fos.write(b ^ xor);
                }
                System.out.println("Encryption - done");
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
