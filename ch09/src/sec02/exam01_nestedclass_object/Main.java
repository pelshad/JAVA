package sec02.exam01_nestedclass_object;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		//a�� �ν��Ͻ��� ���� B�� ������ ȣ��
		//�ٷ� A��ü�� �����ϸ� ����
		A.B b = a.new B();
		
		b.field1 = 3;
		b.method1();
		
	}

}
