
public class EvCar extends Car {
	int charge = 100;
	
	EvCar() {
		super(2024,"Tesla", "model X"); 
	}
	int getCharge() {
		return this.charge;
	}
	void charge() {
		this.charge = 100;
		System.out.println("You charged you car.");
	}
	
}
