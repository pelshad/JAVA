package sec05.exam01_final_class;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	// stop�޼ҵ�� final�޼ҵ�� �������̵� ���� ����
	/*@Ovverrid
	public void stop() {
		
	}*/
	
}
