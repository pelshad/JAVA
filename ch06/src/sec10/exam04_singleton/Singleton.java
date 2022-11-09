package sec10.exam04_singleton;

public class Singleton {
	//싱글톤 만드는 법
	//1. 클래스 자신의 타입으로 정적필드를 선언하고, 자신의 객체를 생성해 초기화한다.
	private static Singleton singleton = new Singleton();
	
	//2. 외부에서 new 연산자로 생성자를 호출 할 수 없도록 막는다
	private Singleton() {}
	
	//3. 외부에서 호출할 수 있는 정적 메소드를 만든다.
	static Singleton getInstance() {
		return singleton;
	}
}
