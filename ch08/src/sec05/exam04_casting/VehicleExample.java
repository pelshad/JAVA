package sec05.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		//�������̽� Ÿ�� ������ ���� ��ü�� ����
		Vehicle vc = new Bus();
		
		// vc �ν��Ͻ������� �������̽� �ȿ� �ִ� run()�޼ҵ常 ȣ�Ⱑ��
		// bus class�� run �޼ҵ�� �������̵� �Ǿ� �ֱ���
		vc.run();
		//vc.checkFare();
		System.out.println();
		
		// ���� Ÿ�� ��ȯ
		// ���� Ÿ�� ��ȯ�� ���ؼ� �������̽� �������� ���Ե� ��ü�� ������ ��츸 ����
		Bus bus = (Bus) vc;
		bus.run();
		bus.checkFare();
		
		//�̷� ��� Ÿ���� ���°� �ȸ±� ������ �Ұ���
		/* Vehicle vc = new Taxi();
		Bus bus = (Bus) vc; */
		
		

	}

}
