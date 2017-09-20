
public class raceTester {

	public static void main(String[] args) {
		RaceMediator rMediator=RaceMediator.instance;//Mediator between the cars & ResultsManager
		rMediator.startRaceForCars(new RacingCar[]{//Register 3 cars to the race
			new RacingCar("Nisan Z370", 2),//intermediate
			new RacingCar("Honda Civic", 1),//slowest
			new RacingCar("Lamborghini Elemento", 3)//fastest
		});
	}

}
