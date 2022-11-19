package sec06.exam01_protected_package2;

import sec06.exam01_protected_package1.A;

public class D extends A {
	public D() {
		//D는 A의 자식이라 A의 값을 호출 가능
		//단, new연산자를 사용해서 생성자를 직접 호출 할 수 없고,
		//자식 생성자에서 super()로 생성자를 호출 할 수 있다.
		super(); //A생성자 호출
		this.field = "value"; //A필드 호출
		this.methode(); //A메소드 호출
	}
	
	public void method() {
		this.field = "value";
		this.methode();
	}
	
	
}
