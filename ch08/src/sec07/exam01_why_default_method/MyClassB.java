package sec07.exam01_why_default_method;

public class MyClassB implements MyInterface{

	@Override
	public void method1() {
		System.out.println("method1 실행");
		
	}
	
	@Override
	public void method2() {
		System.out.println("Override된 method2 실행");
	}

}
