package sec07.exam02_promotion_access;

public class Child extends Parent{
	
	@Override
	public void method2() {
		System.out.println("Call Child Method2");
	}
	
	public void method3() {
		System.out.println("Call Child Method3");
	}
}
