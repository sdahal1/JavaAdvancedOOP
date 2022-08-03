package olympics_inheritance_demo;

public class Swimmer extends Olympian {
	//100m swim speed
	private double swimSpeed;

	public Swimmer(String firstName, double swimSpeed) {
		//if the parent class has a parameter in its constructor, then we must super that parameter
		super(firstName);
		this.energyLevel = 300;
		this.swimSpeed = swimSpeed;
	}
	
	
	public void swim100meters() {
		this.energyLevel -= 25;
	}
	
	public void butterflyEvent() {
		this.energyLevel -= 200;
	}
	
//	@Override
	public void displayInfo() {
		System.out.printf("Player name: %s \nEnergy Level: %s \nSwim Speed: %s \n", this.firstName, this.energyLevel, this.swimSpeed);
	}


	public double getSwimSpeed() {
		return swimSpeed;
	}


	public void setSwimSpeed(double swimSpeed) {
		if(swimSpeed > 0) {
			this.swimSpeed = swimSpeed;
		}
	}
	
	
	
	

}
