package sec02.exam02_staticclass_object;

public class Main {

	public static void main(String[] args) {
		//정적 멤버 클래스는 A의 인스턴스없이 바로 생성가능
		A.C c = new A.C();
		//C의 인스턴스 필드와 메소드 호출
		c.field1 = 3;
		c.method1();
		
		//C의 정적 필드와 메소드 호출
		A.C.field2 = 3;
		A.C.method2();
		
	}

}
