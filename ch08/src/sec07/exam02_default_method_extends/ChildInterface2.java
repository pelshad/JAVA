package sec07.exam02_default_method_extends;

public interface ChildInterface2 extends ParentInterface {
	//�θ��� default �޼ҵ� override
	@Override
	default void method2() {
		System.out.println("�ڽ� override default �޼ҵ�");
	}
	public void method3();
}
