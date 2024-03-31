
public class Car {

	String color = "Blue";
	String type = "Sedan";
	int serialNumber;
	static int carCount = 0;

	public Car(String c, String t) {
		this.color = c;
		this.type = t;
	}

	public Car() {
		this("White", "Sedan");
	}

	void start() {

	}

	void accelerate() {

	}

	void stop() {

	}

	public String toString() {
		String printDescription = "This is a " + this.color + " " + this.type;
		return printDescription;
	}
}
