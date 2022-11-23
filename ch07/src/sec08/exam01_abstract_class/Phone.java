package sec08.exam01_abstract_class;

// abstract :: 추상화
public abstract class Phone {
	//추상클래스는 인스턴스를 만들 수 없고 오로지 자식에게 그 값을 물려주는 것만 가능
	//구현해야할 클래스의 기준(규격)을 제시하는 클래스
	
	public String owner;
	
	//추상 클래스 자체는 인스턴스 생성을 못하지만
	//자식 클래스의 생성자를 위해 생성자가 존재는 가능함
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("폰 전원을 켭니다");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
