package sec02.exam03_localclass_object;

public class A {
	A(){
		System.out.println("A��ü�� ������");
	}
	
	//���� Ŭ���� D
	void method() {
		class D {
			int field1;
			//static int field2; ���� �ʵ�� ���� �Ұ�
			D(){
				System.out.println("D��ü�� ������");
			}
			void method1() {};
			//static void method2() {}; ���� �޼ҵ�� ���� �Ұ�
		}
		//D�� ��� �޼ҵ� �ȿ����� ��� ����(�ܺο��� ��� �Ұ�)
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
