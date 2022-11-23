package sec08.exam01_abstract_class;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone은 추상 클래스기 때문에 생성 불가
		//Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		smartPhone.turnOn(); // 추상 클래스의 메소드
		smartPhone.internetSearch(); // 본 클래스의 메소드
		smartPhone.turnOff(); // 추상 클래스의 메소드
	}
}
