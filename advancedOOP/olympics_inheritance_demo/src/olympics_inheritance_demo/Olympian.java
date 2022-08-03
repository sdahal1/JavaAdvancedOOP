package olympics_inheritance_demo;

//olympian class that represents an olympian
public class Olympian {
	//member variables (english: attributes/characteristics)
	public String firstName;
	public int energyLevel;
	
	//constructor for the olympian class
	public Olympian(String firstName) {
		this.firstName = firstName;
		this.energyLevel = 100;
	}
	
	//methods (english: things that the class objects can do)
	public void displayInfo() {
		System.out.printf("Player name: %s \nEnergy Level: %s \n", this.firstName, this.energyLevel);
	}
	
}
