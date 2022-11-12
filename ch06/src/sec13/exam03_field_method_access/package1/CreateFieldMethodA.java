package sec13.exam03_field_method_access.package1;

public class CreateFieldMethodA {
	//자세한 설명은 constructor_access쪽 참고
	//두번 적긴 귀찮...
	public int field1;
	int field2;
	private int field3;
	
	public void method1() {};
	void method2() {};
	private void method3() {};
	
	public CreateFieldMethodA() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
	
}
