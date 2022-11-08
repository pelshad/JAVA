package sec10.exam01_static_member;

public class Calculator {
	//static이 붙으면 class의 필드와 메소드가 됨
	//호출시 클래스명.필드, 클래스명.메소드로 사용
	//인스턴스에서도 호출이 가능하나 비추천

	//static을 붙이지 않으면 인스턴스의 필드와 메소드가 됨
	//호출시 인스턴스명.필드, 인스턴스명.메소드로 사용
	
	static double pi = 3.14159;
	static int plus(int x, int y) {
		return x + y;
	}
	static int minus(int x, int y) {
		return x - y;
	}
}
