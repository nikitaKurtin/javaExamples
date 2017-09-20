//Lightweight mediator between RacingCars & ResultsManager
public class RaceMediator {
	public final static RaceMediator instance=new RaceMediator();//singleton instance container
	private static RacingCar cars[];//since it's singleton - array of registered cars can be static
	private RaceMediator(){}//no direct objects from this class allowed
	/**Note: 
	 * Mediator methods are non-static, because if Mediator wasn't legally instantiated the entire race isn't legal
	 * So calling for any of those method will cause NullPointerException - and prevent illegal usage
	 */
	//Access for registered cars 
	public RacingCar[] cars(){
		return RaceMediator.cars;
	}
	//Register cars for the race
	public void startRaceForCars(RacingCar cars[]){
		if(RaceMediator.cars==null)RaceMediator.cars=new RacingCar[cars.length];//Allocate memory for needed size - Otherwise ignored
		//OR: throw unchecked IllegalStateException
		//else throw new IllegalStateException("Cars cannot be reset - in the middle of the Race");
		new ResultsManager();//Activate ResultsManager 
	}
	//When resource is accessible to more than one thread we can synchronize the access to it by using synchronized reserved word
	public synchronized int placeCar(RacingCar car){
		int place=0;
		for(int i=0;i<RaceMediator.cars.length;i++){
	    	 if(RaceMediator.cars[i]==null){//find highest empty place (At this point you can also check if car already exists)
	    		 RaceMediator.cars[i]=car;//and assign given car to it
	    		 place=i+1;//calculate it's place
	    		 System.out.println(car.getName()+"placed on");
	    		 break;//don't proceed
	    	 }
	    }
		return place;
	}
}
