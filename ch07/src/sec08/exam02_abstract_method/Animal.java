package sec08.exam02_abstract_method;

public abstract class Animal {
	public String kind;
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	};
	//추상 메소드는 추상 클래스에서만 작성 가능
	//추상 메소드는 실체 클래스에서 반드시 작성되어야 한다.
	public abstract void sound();
}
