package sec07.exam03_constructor_overloading;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("����");
		Car car3 = new Car("����", 120);
		Car car4 = new Car("����", "��Ʈ", 120);
		Car car5 = new Car();
		
		car5.company = "ȸ��";
		car5.model = "SUV";
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		System.out.println(car4);
		System.out.println(car5);
	}

}
