package sec14.exam01_getter_setter;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		//System.out.println(myCar.speed);
		//privateŰ�̱� ������ �Ұ���
		System.out.println(myCar.getSpeed());
		System.out.println(myCar.isStop());
		System.out.println();

		myCar.setSpeed(60);
		myCar.setStop(false);
		System.out.println(myCar.getSpeed());
		System.out.println(myCar.isStop());
		System.out.println();
	
		myCar.setSpeed(-60);
		//setter�� �������� ���� -���� �ȵ�
		myCar.setStop(false);
		System.out.println(myCar.getSpeed());
		System.out.println(myCar.isStop());
		System.out.println();
		
		myCar.setSpeed(60);
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println(myCar.getSpeed());
		System.out.println(myCar.isStop());
	}

}
