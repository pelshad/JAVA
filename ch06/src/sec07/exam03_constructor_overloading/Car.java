package sec07.exam03_constructor_overloading;

public class Car {
	String company = "company";
	String model;
	int speed;
	String color;
	// �����ε� :: �����ڸ� ������ ����°�
	// �����ε� �ϴ� ����
	// ��ü�� ������ �� �ܺ��� ������ ��ü�� �ʱ�ȭ�� �ʿ䰡 �ִ�.
	// �ܺ��� ���� � Ÿ������ �� ���� ���������� �𸣱� ������ �����ڵ�
	// �پ�ȭ���� �ʿ䰡 �ִ�.
	
	public Car() {}
	// �ٸ� �����ڰ� ������ ��� �⺻ �����ڸ� ���� ���� �ʱ⶧���� ���� �������ߵ�
	
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
	
	//if �Ķ������ ���� ������ �����Ұ�� ������ ����(�����ε��� �ƴ�)
	//�Ķ������ ���� ������ ������ �ٸ��� �����ε� O
}
