package olympics_inheritance_demo;

//olympian class that represents an olympian
public abstract class Olympian {
	//member variables (english: attributes/characteristics)
	protected String firstName;
	protected int energyLevel;
	
	//constructor for the olympian class
	public Olympian(String firstName) {
		this.firstName = firstName;
		this.energyLevel = 100;
	}
	
	//methods (english: things that the class objects can do)
	public abstract void displayInfo();

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	
	
}
