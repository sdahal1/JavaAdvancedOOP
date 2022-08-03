package phone_interfaces_and_abstract_demo;

public class Android extends Phone implements Ringable{

	public Android(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayInfo() {
		System.out.printf("Android details bought to you by Google: \n Version Number: %s \n Battery Percentage: %s \n Carrier: %s \n Ring Tone: %s", this.getVersionNumber(), this.getBatteryPercentage(), this.getCarrier(), this.getRingTone());
		
	}

	@Override
	public void ring() {
		// TODO Auto-generated method stub
		System.out.println("Androiddddddd brrrr and there is the ringotne " + this.getRingTone());
		
	}

	@Override
	public void unlockPhone() {
		// TODO Auto-generated method stub
		System.out.println("Scanning your face using android camera tho. Ok you can unlock now");
		
	}

}
