package sec05.exam01_field_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		
		System.out.println();
		
		//promotion(자동 타입 변환)
		//Car Class에서 기본으로 설정된 Tire 인스턴스 필드의 값을 바꿈
		myCar.FrontLeftTire = new KumhoTire();
		myCar.FrontRightTire = new KumhoTire();
		myCar.run();
	}

}
