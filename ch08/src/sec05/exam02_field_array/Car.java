package sec05.exam02_field_array;

public class Car {
	// ���� ��ü�� �迭�� ����
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};
	
	public void run() {
		//���� for���� Ȱ��
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
