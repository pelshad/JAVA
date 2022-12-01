package sec06.exam01_interface_extends;

public class ImplementationC implements InterfaceC {
	//InterfaceC를 구현한 객체이기 때문에 C의 부모인 A,B의 추상메소드도 모두
	//구현해야된다.
	@Override
	public void methodA() {
		System.out.println("methodA 실행");
	}

	@Override
	public void methodB() {
		System.out.println("methodB 실행");
	}

	@Override
	public void methodC() {
		System.out.println("methodC 실행");
	}
	
}
