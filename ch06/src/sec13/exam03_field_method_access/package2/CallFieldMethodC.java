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
		
		//�ٸ� ��Ű���� C�� A�� public�� �ʵ�� �޼ҵ常 ��밡��
	}
}
