package sec02.exam02_staticclass_object.copy;

public class A {
	A(){
		System.out.println("A��ü�� ������");
	}
	
	//��ø ���� Ŭ���� C
	static class C{
		//���� Ŭ������ ���� ����� ���� �޼ҵ� ���� ����
		int field1;
		static int field2;
		void method1() {};
		static void method2() {};
		C(){
			System.out.println("C��ü�� ������");
		}
	}
	
}
