package sec05.exam02_field_array;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		
		System.out.println();
		
		// Car class���� tire�� �迭�� ��ұ� ������ �迭���� �ҷ��� �ٲ�
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
		myCar.run();
	}

}
