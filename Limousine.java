
public class Limousine extends Car {
	private int passengers;
	private Driver driver;
	
	Limousine(){
		passengers = 0;
		driver = null;
	}

	public Limousine(String plate, int psng) {
		super(plate);
		passengers = psng;
		driver = null;
	}
	
	public void setDriver(Driver d) {
		driver = d;
	}
	
	public String getDriverName() {
		return driver.getName();
	}

	public String toString() {
		return "The limo can carry: " + passengers + " people" ;
	}
	
	
	
	
}
