package sec03.exam02_field_method_access;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B{
		void method() {
			//A�� �ν��Ͻ� �ʵ�� �ν��Ͻ� �޼ҵ� ���� ����
			field1 = 1;
			method1();
			//A�� ���� �ʵ�� ���� �޼ҵ� ���� ����
			field2 = 1;
			method2();
		}
	}
	
	static class C{
		void method() {
			//A�� �ν��Ͻ� �ʵ�� �ν��Ͻ� �޼ҵ� ���� �Ұ���
			//A�� ��ü�� ��� C��ü�� ����� �� �� �ֱ� ������ ��� �Ұ��� 
			//field1 = 1;
			//method1();
			//A�� ���� �ʵ�� ���� �޼ҵ� ���� ����
			field2 = 1;
			method2();
		}
	}
}
