package sec10.exam01_static_member;

public class Car {
	// static ����� �Ǵ� ����
	// �ʵ�
	// ��ü���� �޶� �� �� �ִ� �� :: �ν��Ͻ� �ʵ�
	// ���� ������ :: ���� �ʵ�
	
	String color;
	static double maxSpeed = 250;
	//color�� ��� Car �ν��Ͻ� ���� �ٸ� �� �� �� �����Ƿ� static�� �Ⱦ�
	//maxSpeed�� ��� ��� ���� �ְ� �ӵ��� 250�̶�� �����̶��
	//������ ���̴� static���� ����(�޸� �����!)
	
	// �޼ҵ�
	// �ν��Ͻ� �ʵ��� ������ �۾��ؾ��� �޼ҵ� :: �ν��Ͻ� �޼ҵ�
	// �ν��Ͻ� �ʵ��� ������ �۾����� �ʴ� �޼ҵ� :: ���� �޼ҵ�
	
	void setColor(String color) {
		this.color = color;
	}
	static int plus(int x, int y) {
		return x + y;
	}
	// setColor�� ���� �ν��Ͻ� �ʵ��� ���� ����ϱ� ������ static�� ������
	// �Ƿ� this�� ���� ������ ������ ��
	// �Ʒ� plus�޼ҵ��� x,y���� �ν��Ͻ� �ʵ尡 �������� �ʱ� ������ static�� ���
}
