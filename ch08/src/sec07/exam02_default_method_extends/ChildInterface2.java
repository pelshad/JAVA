package sec07.exam02_default_method_extends;

public interface ChildInterface2 extends ParentInterface {
	//부모의 default 메소드 override
	@Override
	default void method2() {
		System.out.println("자식 override default 메소드");
	}
	public void method3();
}
