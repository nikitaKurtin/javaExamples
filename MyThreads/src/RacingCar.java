
public class RacingCar extends Thread {
	private int speed;
	public RacingCar (String name, int speed){
		super(name);//Since Thread has name - we can reuse it
		if(speed<=0)throw new AssertionError("RacingCar speed - must to be bigger than zero");
		this.speed=speed;//assign valid speed
		start();
	}
	@Override
	public void run() {
		 String name=this.getName();//Local variable for reuse
		 try {
	         for(int i = 0; i < 5; i++){
	            System.out.println(name+" reached "+i+" Check-Point");
	            Thread.sleep(1500/speed);
	         }
	     } catch (InterruptedException e) {
	         System.out.println(name+" interrupted.");
	     }
		 //this RacingCar has finished - and checks in which place 
		 int place=RaceMediator.instance.placeCar(this);
		 //Race track - finishing print:
		 System.out.println("***************************");
	     System.out.println(name+" Finished at: "+place+" place");
	     System.out.println("***************************");
	}
}