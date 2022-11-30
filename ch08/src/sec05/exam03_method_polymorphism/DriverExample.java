package sec05.exam03_method_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		Driver dr = new Driver();
		//drive 메소드에 각각 다른 객체를 매개변수로 넣는다.
		dr.drive(new Bus());
		dr.drive(new Taxi());
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		dr.drive(bus);
		dr.drive(taxi);

	}

}
