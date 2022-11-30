package sec05.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		//인터페이스 타입 변수에 구현 객체를 대입
		Vehicle vc = new Bus();
		
		// vc 인스턴스에서는 인터페이스 안에 있는 run()메소드만 호출가능
		// bus class의 run 메소드로 오버라이딩 되어 있긴함
		vc.run();
		//vc.checkFare();
		System.out.println();
		
		// 강제 타입 변환
		// 강제 타입 변환을 위해선 인터페이스 변수에서 대입된 객체와 동일한 경우만 가능
		Bus bus = (Bus) vc;
		bus.run();
		bus.checkFare();
		
		//이런 경우 타입의 형태가 안맞기 때문에 불가능
		/* Vehicle vc = new Taxi();
		Bus bus = (Bus) vc; */
		
		

	}

}
