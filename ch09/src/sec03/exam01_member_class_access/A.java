package sec03.exam01_member_class_access;

public class A {
	class B {};
	static class C {};
	
	//�ν��Ͻ� �ʵ�
	//B�� C ���� ���� ����
	B field1 = new B();
	C field2 = new C();
	
	//�ν��Ͻ� �޼ҵ�
	void method1() {
	//�Ѵ� ���� ����ȭ ����
		B var1 = new B();
		C var2 = new C();
	}
	
	//���� �ʵ�
	//A�� �������� ���� ���¿��� �ν��Ͻ� ��ü�� B�� ���� �Ұ�
	//static B field3 = new B();
	////A�� �������� ���� �������� ���� ��ü�� C�� ���� ����
	static C field4 = new C();
	
	//���� �޼ҵ�
	static void method2() {
		//A�� �������� ���� ���¿��� �ν��Ͻ� ���� ��ü�� B�� ���� �Ұ�
		//B var3 = new B();
		////A�� �������� ���� �������� ���� ���� ��ü�� C�� ���� ����
		C var4 = new C();
	}
}
