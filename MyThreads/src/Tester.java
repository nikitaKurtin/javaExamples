import java.io.FileNotFoundException;

/**
 * Created by Nikita Kurtin on 17/08/2017.
 */
public class Tester {
    public static void main(String[] args) {
    /*
        BubuThread bt = new BubuThread();
        bt.start();//activate in the background
        new BubuThread().start();//also activated in background
        new GrootThread();//activated in background
        RemCtrlThread rct = new RemCtrlThread();
        rct.enable();//activate in the background
        for(int i=0;i<20;i++){//run in Main thread
            try {
                Thread.sleep(300);//don't do anything for 300 milliseconds
                System.out.println("Main thread "+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        rct.disable();//stop background activation

        //inline usage with Thread
        new Thread(){
            public void run() {//this block - run in the background
                System.out.println("Inline  thread - one");
            }
        }.start();

        //inline usage with Runnable
        new Thread(new Runnable() {
            public void run() {
                System.out.println("Inline  thread - two");
            }
        }).start();

        /*/
        //Exercise
        try {
            new FileEncrypter("files/check.jpg").encrypt(15);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        //*/
    }


}