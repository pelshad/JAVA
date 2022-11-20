package sec07.exam03_field_ploymorphism;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
				case 1:
					System.out.println("�տ��� HankookTire�� ��ü");
					car.frontLeftTire = new HankookTire("�տ���", 15);
					break;
				case 2:
					System.out.println("�տ��� HankookTire�� ��ü");
					car.frontRightTire = new KumhoTire("�տ�����", 13);
					break;
				case 3:
					System.out.println("�տ��� HankookTire�� ��ü");
					car.backLeftTire = new HankookTire("�ڿ���", 14);
					break;
				case 4:
					System.out.println("�տ��� HankookTire�� ��ü");
					car.backRightTire = new KumhoTire("�ڿ�����", 17);
					break;
			}
			System.out.println("----------------------------------");
		}

	}

}
