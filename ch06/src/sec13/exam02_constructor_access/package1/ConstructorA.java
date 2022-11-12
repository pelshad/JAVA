package sec13.exam02_constructor_access.package1;

public class ConstructorA {
	ConstructorA a1 = new ConstructorA(true);
	ConstructorA a2 = new ConstructorA();
	ConstructorA a3 = new ConstructorA("private");
	
	public ConstructorA(boolean b) {}
	//public 접근제한 생성자 A
	//다른 패키지의 클래스에서 생성 가능
	
	ConstructorA() {}
	//default 접근제한 생성자 A
	//같은 패키지의 클래스에서만 생성 가능
	
	private ConstructorA(String s) {}
	//private 접근제한 생성자 A
	//본인 클래스에서만 생성 가능
	
} 
