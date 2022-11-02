package sec07.exam03_constructor_overloading;

public class Car {
	String company = "company";
	String model;
	int speed;
	String color;
	// 오버로딩 :: 생성자를 여러개 만드는것
	// 오버로딩 하는 이유
	// 객체를 생성할 때 외부의 값으로 객체를 초기화할 필요가 있다.
	// 외부의 값이 어떤 타입으로 몇 개가 제공도리지 모르기 때문에 생성자도
	// 다양화해질 필요가 있다.
	
	public Car() {}
	// 다른 생성자가 존재할 경우 기본 생성자를 생성 하지 않기때문에 따로 만들어줘야됨
	
	public Car(String model) {
		this.model = model;
	}
	
	public Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}
	
	public Car(String model, String color, int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	
	public String toString() {
		return company + " : " + model + " : " + speed + " : " + color; 
	}
	
	//if 파라미터의 수와 순서가 동일할경우 컴파일 에러(오버로딩이 아님)
	//파라미터의 수가 같지만 순서가 다르면 오버로딩 O
}
