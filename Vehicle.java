package Garage;

public class Vehicle {

	private double weight;
	private double fuel;
	private int price;
	private String brand;
	private String isAuto; //manual or auto
	
	public Vehicle() {};
	
	public Vehicle(double weight, double fuel, int price, String brand) {
		setWeight(weight);
		setFuel(fuel);
		setPrice(price);
		setBrand(brand);
		setIsAuto("NO");
	}
	
	
	//functions
	public void TransmissionM() {
		if(this.isAuto == "YES") {
			System.out.println("This car is already auto");
		} else {
			this.setIsAuto("YES");
			System.out.println("Car is auto");
			
		}
	}
	
	public void TrasmissionA() {
		if(this.isAuto == "NO") {
			System.out.println("This car is already manual");
		} else {
			this.setIsAuto("NO");
			System.out.println("Car is manual");
			
		}
	}
	
	//getter and setters
	
	public double getWeight() {
		return weight;
	}
	public String getIsAuto() {
		return isAuto;
	}

	public void setIsAuto(String isAuto) {
		this.isAuto = isAuto;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getFuel() {
		return fuel;
	}
	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
		
	
}