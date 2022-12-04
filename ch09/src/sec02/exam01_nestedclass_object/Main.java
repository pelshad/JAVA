package sec02.exam01_nestedclass_object;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		//a의 인스턴스를 통해 B의 생성자 호출
		//바로 A객체를 대입하면 에러
		A.B b = a.new B();
		
		b.field1 = 3;
		b.method1();
		
	}

}
