package sec07.exam01_why_default_method;

public class DefaultMethodExample {

	public static void main(String[] args) {
		//�ʱ� ������ Ŭ����
		MyInterface mi1 = new MyClassA();
		mi1.method1();
		
		System.out.println();
		//�Ŀ� �߰��� ������ Ŭ����
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.method2();

	}

}
