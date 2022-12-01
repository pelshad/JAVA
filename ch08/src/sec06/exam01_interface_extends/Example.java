package sec06.exam01_interface_extends;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		//InterfaceA 변수인 ia는 A의 메소드밖에 사용할 수 없다.
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		//InterfaceB 변수인 ib는 B의 메소드밖에 사용할 수 없다.
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		//InterfaceA와 InterfaceB의 자식인 
		//InterfaceC의 변수 ic는 A,B,C의 메소드를 전부 사용 할 수 있다.
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}

}
