package sec03.exam02_field_method_access;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B{
		void method() {
			//A의 인스턴스 필드와 인스턴스 메소드 접근 가능
			field1 = 1;
			method1();
			//A의 정적 필드와 정적 메소드 접근 가능
			field2 = 1;
			method2();
		}
	}
	
	static class C{
		void method() {
			//A의 인스턴스 필드와 인스턴스 메소드 접근 불가능
			//A의 객체가 없어도 C객체는 만들어 질 수 있기 때문에 사용 불가능 
			//field1 = 1;
			//method1();
			//A의 정적 필드와 정적 메소드 접근 가능
			field2 = 1;
			method2();
		}
	}
}
