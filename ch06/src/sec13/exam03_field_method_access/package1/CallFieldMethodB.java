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
	
	//A�� ���� ��Ű���� ������ public�� default �ʵ� �޼ҵ�� ���ٰ���

}