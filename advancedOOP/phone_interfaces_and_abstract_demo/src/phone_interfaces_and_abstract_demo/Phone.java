package phone_interfaces_and_abstract_demo;

public abstract class Phone {
	//versionnumber
	private String versionNumber;
	
	//battery percentage
	private int batteryPercentage;
	
	//carrier
	private String carrier;
	
	//ringtone
	private String ringTone;

	//constructor
	public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		this.versionNumber = versionNumber;
		this.batteryPercentage = batteryPercentage;
		this.carrier = carrier;
		this.ringTone = ringTone;
	}
	
	
	//abstract method
	public abstract void displayInfo();
	
	
	
	//GETTERS AND SETTERS ARE BELOW

	public String getVersionNumber() {
		return versionNumber;
	}

	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}

	public int getBatteryPercentage() {
		return batteryPercentage;
	}

	public void setBatteryPercentage(int batteryPercentage) {
		this.batteryPercentage = batteryPercentage;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getRingTone() {
		return ringTone;
	}

	public void setRingTone(String ringTone) {
		this.ringTone = ringTone;
	}
	
	
	
	
	
	
	
	
	
}
