package sec02.exam01_nestedclass_object;

public class A {
	A(){
		System.out.println("A객체가 생성됨");
		//A의 필드, 생성자, 메소드에서 사용 가능
		/* B b = new B();
		b.field1 = 3;
		b.method1(); */
	}
	
	//중첩 클래스 B
	class B{
		int field1;
		//static int field2; 정적 필드는 생성 불가
		B(){
			System.out.println("B객체가 생성됨");
		}
		void method1() {};
		//static void method2() {}; 정적 메소드는 생성 불가
	}
}
