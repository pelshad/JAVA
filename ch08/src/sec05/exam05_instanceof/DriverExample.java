package sec05.exam05_instanceof;

public class DriverExample {

	public static void main(String[] args) {
		Driver dr = new Driver();
		//drive �޼ҵ忡 ���� �ٸ� ��ü�� �Ű������� �ִ´�.
		//������ �� ��� ����Ÿ�� ��ȯ�� ���� checkFare �޼ҵ嵵 ȣ��
		dr.drive(new Bus());
		System.out.println();
		dr.drive(new Taxi());
	}

}
