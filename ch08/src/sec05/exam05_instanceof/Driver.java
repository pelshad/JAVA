package sec05.exam05_instanceof;

public class Driver {
	public void drive(Vehicle vehicle) {
		//Bus��ü�� �Ű������� ������ ��� Casting,
		//������ ������ Casting�� �ع����� ���ܰ� �߻� �� �� �����Ƿ�
		//instanceof �޼ҵ带 ���� üũ
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		
		vehicle.run();
	}
}
