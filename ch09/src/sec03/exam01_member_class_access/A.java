package sec03.exam01_member_class_access;

public class A {
	class B {};
	static class C {};
	
	//인스턴스 필드
	//B와 C 전부 생성 가능
	B field1 = new B();
	C field2 = new C();
	
	//인스턴스 메소드
	void method1() {
	//둘다 로컬 변수화 가능
		B var1 = new B();
		C var2 = new C();
	}
	
	//정적 필드
	//A가 생성되지 않은 상태에서 인스턴스 객체인 B는 생성 불가
	//static B field3 = new B();
	////A가 생성되지 않은 상태지만 정적 객체인 C는 생성 가능
	static C field4 = new C();
	
	//정적 메소드
	static void method2() {
		//A가 생성되지 않은 상태에서 인스턴스 로컬 객체인 B는 생성 불가
		//B var3 = new B();
		////A가 생성되지 않은 상태지만 정적 로컬 객체인 C는 생성 가능
		C var4 = new C();
	}
}
