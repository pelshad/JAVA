package sec07.exam01_constructor_decorataion;

public class Car {
	String company;
	String color;
	int maxSpeed;
	public Car(String company, String color, int maxSpeed) {
		//this�� ����ϴ� ���� -> ������ ���ο����� �Ű������� �켱 �����⸦ ������ ����
		this.company = company;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
