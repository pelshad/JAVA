package sec02.exam02_staticclass_object;

public class Main {

	public static void main(String[] args) {
		//���� ��� Ŭ������ A�� �ν��Ͻ����� �ٷ� ��������
		A.C c = new A.C();
		//C�� �ν��Ͻ� �ʵ�� �޼ҵ� ȣ��
		c.field1 = 3;
		c.method1();
		
		//C�� ���� �ʵ�� �޼ҵ� ȣ��
		A.C.field2 = 3;
		A.C.method2();
		
	}

}
