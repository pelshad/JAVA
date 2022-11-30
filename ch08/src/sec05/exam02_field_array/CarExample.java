package sec05.exam02_field_array;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		
		System.out.println();
		
		// Car class에서 tire를 배열로 담았기 때문에 배열값을 불러서 바꿈
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
		myCar.run();
	}

}
