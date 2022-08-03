package phone_interfaces_and_abstract_demo;

public class Iphone extends Phone implements Ringable {

	//constructor will accept versionNumer, battery%, carrier, and ringTone as inputs to generate a phone with
	public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		
		//Super means-> pass the inputs to the constructor of the PARENT class
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.printf("Iphone details: \n Version Number: %s \n Battery Percentage: %s \n Carrier: %s \n Ring Tone: %s", this.getVersionNumber(), this.getBatteryPercentage(), this.getCarrier(), this.getRingTone());
	}

	
	
	public void ring() {
		// TODO Auto-generated method stub
		System.out.println("Iphone ringing with the Siri noise! " + this.getRingTone());
		
	}

	
	public void unlockPhone() {
		// TODO Auto-generated method stub
		System.out.println("Scanning face....okay unlocked");
		
	}
	

}
