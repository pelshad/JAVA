package sec07.exam01_why_default_method;

public class DefaultMethodExample {

	public static void main(String[] args) {
		//초기 구현된 클래스
		MyInterface mi1 = new MyClassA();
		mi1.method1();
		
		System.out.println();
		//후에 추가로 구현된 클래스
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.method2();

	}

}
