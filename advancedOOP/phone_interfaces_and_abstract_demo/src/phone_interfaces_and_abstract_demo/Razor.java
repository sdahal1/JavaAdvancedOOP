package phone_interfaces_and_abstract_demo;

public class Razor extends Phone{

	public Razor(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.printf("Motorola Razor details (Helloo moto): \n Version Number: %s \n Battery Percentage: %s \n Carrier: %s \n Ring Tone: %s", this.getVersionNumber(), this.getBatteryPercentage(), this.getCarrier(), this.getRingTone());
		
	}

}
