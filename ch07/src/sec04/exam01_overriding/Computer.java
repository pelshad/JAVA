package sec04.exam01_overriding;

public class Computer extends Calculator {
	//Override �������� �޼ҵ尡 �´��� Ȯ���ϴ� ������̼�
	//���� �θ�� �ٸ� �޼ҵ����¸� ������� �������̵�Ǵ°� �ƴ� ���ο� �޼ҵ带 �����ϰ� ��
	//����, �޼ҵ� ��Ī �� �Ű����� ���� �θ�� ���Ͽ� �������� ������ ������ ������ �����ϴ� ������̼�
	@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� �޼ҵ��Դϴ�");
		return Math.PI*r*r;
	}
	
	//��Ŭ�������� �������̵��ϴ� ���
	//1. ���� ����
	//2. Source -> Override/Implement Methods
	//3. ctrl + space -> �������̵��� �޼ҵ� ����
}
