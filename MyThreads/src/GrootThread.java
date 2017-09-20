/**
 * Created by Nikita Kurtin on 17/08/2017.
 */
public class GrootThread implements Runnable {
    //Thread object - which we use to start it
    private final Thread t;
    public GrootThread(){
        t = new Thread(this);//pass it's self as target (what to do in background)
        t.start();//activate in the background
    }

    @Override//what to do in the background thread
    public void run() {
        for(int i=0;i<15;i++){
            try {
                Thread.sleep(400);
                System.out.println("Groot thread "+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
