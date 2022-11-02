package sec07.exam03_constructor_overloading;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("경차");
		Car car3 = new Car("경차", 120);
		Car car4 = new Car("경차", "민트", 120);
		Car car5 = new Car();
		
		car5.company = "회사";
		car5.model = "SUV";
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		System.out.println(car4);
		System.out.println(car5);
	}

}
