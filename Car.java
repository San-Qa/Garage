package Garage;

public class Car extends Vehicle {

	
public Car() {
	System.out.println("A new car");
}

public Car(double weight, double fuel, int price, String brand) {
	super(weight, fuel, price, brand);
}

public String toString() {
	String str = "Brand: " + super.getBrand();
	str += "\nPrice: " + super.getPrice();
	str += "\nWeight: " + super.getWeight();
	str += "\nFuel: " + super.getFuel();
	str += "\nisAuto: " + super.getIsAuto();
	
	return str;
}
}



	