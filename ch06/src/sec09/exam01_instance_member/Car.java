package sec09.exam01_instance_member;

public class Car {
	//�ν��Ͻ� ���(�ʵ�)
	String model;
	int speed;
	
	Car(String model){
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i = 10; i<=50; i++) {
			//setSpeed(i); �̷��� �ص� �۵���
			this.setSpeed(i); // this�� �������� ��������� ���� ����
			//System.out.println(model + "�� �޸��ϴ�.");
			//parameter�� model�� ���� ������ this�� ��� ���������� ����
			//������ ��������� �����ϱ� ���ؼ� this�� ���
			System.out.println(this.model + "(��)�� �޸��ϴ�.(�ü�:" + this.speed + "km/h)");
			//���� �� this�� �Ƚᵵ �Ǳ���. �׷��� �����ϸ� ���ü��� ���� ���
			//this�� �ν��Ͻ� �ʵ�(�޼ҵ忡���� ��밡��) static���� ��� �ȵ�.
		}
	}
}
