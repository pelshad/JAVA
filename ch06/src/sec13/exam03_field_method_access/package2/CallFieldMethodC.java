package sec13.exam03_field_method_access.package2;

import sec13.exam03_field_method_access.package1.CreateFieldMethodA;

public class CallFieldMethodC {

CreateFieldMethodA a = new CreateFieldMethodA();
	
	public CallFieldMethodC() {
		a.field1 = 1;
		//a.field2 = 1;
		//a.field3 = 1;
		
		a.method1();
		//a.method2();
		//a.method3();
		
		//다른 패키지인 C는 A의 public인 필드와 메소드만 사용가능
	}
}
