package phone_interfaces_and_abstract_demo;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iphone iphone1 = new Iphone("IOS 18", 100, "AT&T", "Chance The Rapper: Blessings" );
		Android a1 = new Android("Marshmellow", 100, "Verizon", "Ding Ding Ding");
		Razor r1 = new Razor("Motorola 1.1", 80, "T mobile", "Hello moto");
		
		iphone1.displayInfo();
		System.out.println("\n********");
		a1.displayInfo();

	}

}
