public class Driver{
	private String name;

	Driver(){
		name = "";
	}

	Driver(String n){
		name = n;
	}

	public String getName(){
		return name;
	}

	public String toString(){
		return "The name of this driver is: " + name;
	}
}
