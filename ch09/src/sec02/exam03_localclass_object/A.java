package sec02.exam03_localclass_object;

public class A {
	A(){
		System.out.println("A객체가 생성됨");
	}
	
	//로컬 클래스 D
	void method() {
		class D {
			int field1;
			//static int field2; 정적 필드는 생성 불가
			D(){
				System.out.println("D객체가 생성됨");
			}
			void method1() {};
			//static void method2() {}; 정적 메소드는 생성 불가
		}
		//D의 경우 메소드 안에서만 사용 가능(외부에서 사용 불가)
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
