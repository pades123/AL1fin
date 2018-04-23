public class Car{
	private String plate;

	Car(){
		plate = "";
	}

	Car(String p){
		plate = p;
	}

	public String toString(){
		return "The plate of this car is: " + plate;
	}
}
