package sec07.exam04_other_constructor_call;

public class Car {
	String company = "company";
	String model;
	int speed;
	String color;
	
	
	public Car() {}
	// ���°� ������ �����ڰ� ������ ��� �ϵ��ڵ� ��� this()�� Ȱ��!
	
	//��ȿ������ �����ε�
	/* public Car(String model) {
		this.model = model;
		this.color = "��Ʈ";
		this.speed = 120;
	}
	
	public Car(String model, int speed) {
		this.model = model;
		this.color = "����";
		this.speed = speed;
	}
	
	public Car(String model, String color, int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
	} */
	
	
	// ȿ������ �����ε�
	// 1, 2�� �����ڴ� 3�� �����ڸ� ȣ��(this())�Ͽ� �����
	// 1
	public Car(String model) {
		// ���� this() ������ ȣ�� �ڵ� �տ� �ٸ� �ڵ尡 ������ ���� �߻�
		// System.out.println("����"); �ּ� Ǯ�� ���� ����
		this(model, "��Ʈ", 120);
		System.out.println("����");
	}
	
	//2
	public Car(String model, int speed) {
		this(model, "����", speed);
	}
	
	//3
	public Car(String model, String color, int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	
	public String toString() {
		return company + " : " + model + " : " + speed + " : " + color; 
	}
	
	
}
