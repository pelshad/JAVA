package sec05.exam03_method_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		Driver dr = new Driver();
		//drive �޼ҵ忡 ���� �ٸ� ��ü�� �Ű������� �ִ´�.
		dr.drive(new Bus());
		dr.drive(new Taxi());
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		dr.drive(bus);
		dr.drive(taxi);

	}

}
