package sec06.exam01_interface_extends;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		//InterfaceA ������ ia�� A�� �޼ҵ�ۿ� ����� �� ����.
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		//InterfaceB ������ ib�� B�� �޼ҵ�ۿ� ����� �� ����.
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		//InterfaceA�� InterfaceB�� �ڽ��� 
		//InterfaceC�� ���� ic�� A,B,C�� �޼ҵ带 ���� ��� �� �� �ִ�.
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}

}
