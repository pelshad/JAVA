package sec06.exam01_protected_package2;

import sec06.exam01_protected_package1.A;

public class D extends A {
	public D() {
		//D�� A�� �ڽ��̶� A�� ���� ȣ�� ����
		//��, new�����ڸ� ����ؼ� �����ڸ� ���� ȣ�� �� �� ����,
		//�ڽ� �����ڿ��� super()�� �����ڸ� ȣ�� �� �� �ִ�.
		super(); //A������ ȣ��
		this.field = "value"; //A�ʵ� ȣ��
		this.methode(); //A�޼ҵ� ȣ��
	}
	
	public void method() {
		this.field = "value";
		this.methode();
	}
	
	
}
