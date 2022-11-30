package sec05.exam05_instanceof;

public class DriverExample {

	public static void main(String[] args) {
		Driver dr = new Driver();
		//drive 메소드에 각각 다른 객체를 매개변수로 넣는다.
		//버스가 들어간 경우 강제타입 변환을 통해 checkFare 메소드도 호출
		dr.drive(new Bus());
		System.out.println();
		dr.drive(new Taxi());
	}

}
