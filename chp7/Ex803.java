
public class Ex803 {
	public static void main(String[] args) {
		Car sf = new Car(); //santa Fe
		EvCar x = new EvCar(); // Model x
		
		//Drive Santa Fe
		sf.printDetails();
		
		for (int i = 0; i < 6; i++) { 
			x.drive();
		}
		System.out.println("you usde" + x.getTank() + 
				"L of oil left.");
		System.out.println("you have" + x.getCharge() + 
				"% battery left.");
		System.out.println("you drove" + x.getkm() + "km.");
		
		//Drive Model x
		x.printDetails();
		
		for (int i = 0; i < 20; i++) {
			if (x.getCharge() <= 10) {
				x.charge();
			}
			x.drive();
		}
		System.out.println("You have" + x.getCharge() + "% battery left.");
		System.out.println("you drove" + x.getCharge() + "km.");
	}

}