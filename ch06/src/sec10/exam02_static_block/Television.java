package sec10.exam02_static_block;

public class Television {
	// �ν��Ͻ� �ʵ�� �޼ҵ��� ��� �����ڸ� ���� �ʱ�ȭ�� �̷�
	// Television(){...} << ������, ��� �ȳ��� �� ���� ����
	
	// ���� �ʵ�� �޼ҵ��� ��� ���� �ʱ�ȭ ����� ���
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	static int from1To10Sum;
	
	//���� �ʱ�ȭ ���
	static {
		info = company + "-" + model;
		
		int sum = 0;
		for(int i=1; i<=10;i++) {
			sum += i;
		}
		from1To10Sum = sum;
	}
	//���� �ʱ�ȭ ����� ����ϴ� ����
	//for, if���� ���� ���๮�� �־� ������ ����� �ʿ��� ������ ���� �� ����
}
