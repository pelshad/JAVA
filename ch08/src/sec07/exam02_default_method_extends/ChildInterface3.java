package sec07.exam02_default_method_extends;

public interface ChildInterface3 extends ParentInterface {
	//부모의 default 메소드를 다시 추상화
	@Override
	public void method2();
	public void method3();
}
