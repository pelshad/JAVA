package sec14.exam01_getter_setter;

public class Car {
	//getter, setter
	//Ŭ������ ������ �� �Ϲ������� �ʵ�� private�� ���������� �Ѵ�.
	//����
	//�б� ���� �ʵ尡 ���� �� ����
	//�ܺο��� ������ ������ ���� �� �� ������ �Ѵ�.
	//(ex.�ӵ��� ��� -�� ���µ� -������ �����Ѵٰų�)
	
	private int speed;
	private boolean stop;
	
	//getter
	//private�� �ʵ尪�� return�ϴ� ����
	//getFieldName()�� ����� boolean Ÿ���� ��� isFieldName()���� ����
	public int getSpeed() {
		return speed;
	}
	public boolean isStop() {
		return stop;
	}
	
	//setter
	//�ܺο��� �־��� ������ �ʵ� �� ����
	//�ʿ��� ��� �ܺ��� ���� ��ȿ�� �˻縦 �Ѵ�.
	//setFieldName()�� �����
	public void setSpeed(int speed) {
		//this.speed = speed�� ������ ��� setter�� �������ǰ� ������
		this.speed = speed > 0 ? speed : 0;
		//�ܺο��� ���̻� speed�� ���� -������ �ٲ� �� ����!(��ȿ�� �˻�) 
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) {
			speed = 0;
		}
	}
	
	//�ڵ����� getter, setter�� ����� ���
	//source���� generate Getters and Setters
}
