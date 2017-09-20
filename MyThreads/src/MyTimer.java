public class MyTimer extends Thread{
    private int time;//Encapsulated instace variable
    public MyTimer(int time, String name){
        super(name);//pass to super(Thread) Thread's name
        this.time=time;//how long to measure
    }
    public void run(){
        try{
            for(;time-->0;){//count down until zero
                Thread.sleep(1000);//wait one second and print how many seconds left
                System.out.println(time+" left for "+this.getName());
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(this.getName()+" done");
    }
}