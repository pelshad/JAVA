package sec07.exam01_constructor_decorataion;

public class Car {
	String company;
	String color;
	int maxSpeed;
	public Car(String company, String color, int maxSpeed) {
		//this를 사용하는 이유 -> 생성자 내부에서는 매개변수가 우선 순위기를 가지기 때문
		this.company = company;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
