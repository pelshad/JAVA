package sec02.exam01_nestedclass_object;

public class A {
	A(){
		System.out.println("A��ü�� ������");
		//A�� �ʵ�, ������, �޼ҵ忡�� ��� ����
		/* B b = new B();
		b.field1 = 3;
		b.method1(); */
	}
	
	//��ø Ŭ���� B
	class B{
		int field1;
		//static int field2; ���� �ʵ�� ���� �Ұ�
		B(){
			System.out.println("B��ü�� ������");
		}
		void method1() {};
		//static void method2() {}; ���� �޼ҵ�� ���� �Ұ�
	}
}
