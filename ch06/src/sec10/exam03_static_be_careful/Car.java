package sec10.exam03_static_be_careful;

public class Car {
	/* ���� �޼ҵ�� ���� ��� �ۼ��� ������
	 * �̵� �޼ҵ�, ��� ���ο� �ν��Ͻ� �ʵ�, �޼ҵ带 ��� �� �� ����
	 * (this ���� �ν��Ͻ��� ���� ����̴� ��� �Ұ�!)
	 */
	int speed;
	
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	public static void main(String[] args) {
		//speed = 60;
		//run();
		//main �޼ҵ� ���� ���� �޼ҵ��̱� ������ ���� �ν��Ͻ� ���� �ٷ� ���� ������ ����
		
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}
}
