package sec13.exam03_field_method_access.package1;

public class CallFieldMethodB {
	
	CreateFieldMethodA a = new CreateFieldMethodA();
	
	public CallFieldMethodB() {
		a.field1 = 1;
		a.field2 = 1;
		//a.field3 = 1;
		
		a.method1();
		a.method2();
		//a.method3();
	}
	
	//A와 같은 패키지기 때문에 public과 default 필드 메소드는 접근가능

}