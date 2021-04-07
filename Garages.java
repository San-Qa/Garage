package Garage;

import java.util.Scanner;

public class Garages {

	private static Car car;
	private static motorcycle motor;
	
	public static void main(String[] args) {
	
	car = new Car(2500, 30, 20000, "BMW");
	motor = new motorcycle(2000, 220, 12000, "YZF", 1000);
	
	car.TransmissionM();
	car.TransmissionM();
	
	//System.out.println("Brand: " + car.getBrand());
	
	System.out.println(car);
	System.out.println(motor);

}
}

