package sec10.exam01_static_member;

public class Calculator {
	//static�� ������ class�� �ʵ�� �޼ҵ尡 ��
	//ȣ��� Ŭ������.�ʵ�, Ŭ������.�޼ҵ�� ���
	//�ν��Ͻ������� ȣ���� �����ϳ� ����õ

	//static�� ������ ������ �ν��Ͻ��� �ʵ�� �޼ҵ尡 ��
	//ȣ��� �ν��Ͻ���.�ʵ�, �ν��Ͻ���.�޼ҵ�� ���
	
	static double pi = 3.14159;
	static int plus(int x, int y) {
		return x + y;
	}
	static int minus(int x, int y) {
		return x - y;
	}
}
