package sec05.exam01_field_polymorphism;

public class Car {
	Tire FrontLeftTire = new HankookTire();
	Tire FrontRightTire = new HankookTire();
	Tire BackLeftTire = new HankookTire();
	Tire BackRightTire = new HankookTire();
	
	public void run() {
		FrontLeftTire.roll();
		FrontRightTire.roll();
		BackLeftTire.roll();
		BackRightTire.roll();
	}
}
