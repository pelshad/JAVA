package sec05.exam01_field_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		
		System.out.println();
		
		//promotion(�ڵ� Ÿ�� ��ȯ)
		//Car Class���� �⺻���� ������ Tire �ν��Ͻ� �ʵ��� ���� �ٲ�
		myCar.FrontLeftTire = new KumhoTire();
		myCar.FrontRightTire = new KumhoTire();
		myCar.run();
	}

}
