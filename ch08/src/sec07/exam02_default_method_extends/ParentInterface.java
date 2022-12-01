package sec07.exam02_default_method_extends;

public interface ParentInterface {
	public void method1();
	default void method2() {
		System.out.println("부모 default 메소드");
	}
	
}
