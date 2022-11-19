package sec06.exam01_protected_package1;

public class B {
	public void method() {
		//A와 같은 패지키이기 때문에 protected인 값들을 호출가능
		A a = new A();
		a.field = "value";
		a.methode();
	}
}
