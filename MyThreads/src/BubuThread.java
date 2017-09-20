/**
 * Created by Nikita Kurtin on 17/08/2017.
 */
public class BubuThread extends Thread {

    @Override//what to do in the background thread
    public void run() {
        for(int i=0; i<10; i++){
            try {
                Thread.sleep(500);//don't do anything for half a second
                System.out.println("BubuThread "+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
