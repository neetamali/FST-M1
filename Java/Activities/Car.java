package activities;

public class Car {
	public String color;
	public String transmission;
	public int make;
	public int tyres;
	public	int doors;
	
public Car() {
	tyres=4;
	doors=4;
}
public void displayCharacteristics() {
	System.out.println("color: "+color);
	System.out.println("transmission: "+transmission);
	System.out.println("make: "+make);
	System.out.println("tyres: "+tyres);
	System.out.println("doors: "+doors);
}

public void accelarate() {
	System.out.println("Car is moving forward.");
}
public void brake() {
	System.out.println("Car has stopped.");
}
}
