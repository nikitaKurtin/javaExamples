/**
 * Created by Nikita Kurtin on 17/08/2017.
 */
public class RemCtrlThread implements Runnable {

    private final Thread t;
    private boolean isAlive;

    public RemCtrlThread(){
        t = new Thread(this);//pass it's self as target Runnable
    }
    //enable from outside
    public void enable(){
        if(!isAlive){//if not activated yet
           t.start();//activate
        }
    }
    //disable from outside
    public void disable(){
        isAlive = false;//de-activate
    }
    @Override//what to do in background
    public void run() {
        isAlive = true;
        for(int i=0; isAlive; i++){
            try {
                Thread.sleep(250);
                System.out.println("Rem ctrl Thread "+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Rem ctrl - done");
    }
}
