package Garage;

public class motorcycle extends Vehicle {

	private double bhp;
	
	//Constructor
	public motorcycle() {
		System.out.println("A new motorcyle");
	}
	
	public motorcycle(double weight, double fuel, int price, String brand, double bhp) {
		super(weight, fuel, price, brand);
		setBhp(bhp);
	}
	
	public String toString() {
		String str = "Brand: " + super.getBrand();
		str += "\nPrice: " + super.getPrice();
		str += "\nWeight: " + super.getWeight();
		str += "\nFuel: " + super.getFuel();
		str += "\nisAuto: " + super.getIsAuto();
		str += "\nBhP: " + this.getBhp();
		
		return str;
	}
	
	//Getter and Setter
	public double getBhp() {
		return bhp;
	}

	public void setBhp(double bhp) {
		this.bhp = bhp;
	}

}
