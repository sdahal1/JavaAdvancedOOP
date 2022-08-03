package olympics_inheritance_demo;

public class BasketballPlayer extends Olympian {
	
	public double verticalJumpHeight;
	

	public BasketballPlayer(String firstName, double verticalJumpHeight) {
		super(firstName); //super means do what the parent class is doing with this parameter
		// TODO Auto-generated constructor stub
		this.energyLevel = 200;
		this.verticalJumpHeight = verticalJumpHeight;
	}
	
	public void shootBball(){
		this.energyLevel -= 10;
	}
	
	@Override
	public void displayInfo() {
		System.out.printf("Player name: %s \nEnergy Level: %s \nJump Height: %s \n", this.firstName, this.energyLevel, this.verticalJumpHeight);
	}
	
	
}
