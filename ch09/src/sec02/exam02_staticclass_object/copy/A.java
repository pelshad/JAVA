package sec02.exam02_staticclass_object.copy;

public class A {
	A(){
		System.out.println("A객체가 생성됨");
	}
	
	//중첩 정적 클래스 C
	static class C{
		//정적 클래스는 정적 멤버와 정적 메소드 생성 가능
		int field1;
		static int field2;
		void method1() {};
		static void method2() {};
		C(){
			System.out.println("C객체가 생성됨");
		}
	}
	
}
