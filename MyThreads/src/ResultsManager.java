import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
//ResultManager - works independently (Loosed coupling) from RacingCars
public class ResultsManager extends Thread {
	public ResultsManager() {
		start();
	}
	private void writeToFile(){
		try {
			//As for as I know there shouldn't be more than a few tens of cars in one race - writing shouldn't be a bottle neck 
			BufferedWriter bw = new BufferedWriter(new FileWriter("results/RaceResults.txt"));//So I choose 
			final RacingCar [] cars=RaceMediator.instance.cars();
			int place=1;
			for(RacingCar car:cars)bw.write((place++)+" place : "+car.getName()+"\r\n");
			bw.close();		
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Race Officially ended");
	}
	@Override
	public void run() {
		//ResultsManager doesn't communicate directly with cars - but through the RaceMediator
		int last=RaceMediator.instance.cars().length-1;//last car index
		while(RaceMediator.instance.cars()[last]==null){//Keep checking if the last RacingCar hasn't finished
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		writeToFile();//When all the cars has finished - write RaceResults
	}
}
