package sec03.exam01_name_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		//인터페이스 변수 선언
		RemoteControl rc;
		
		//인터페이스는 본인을 대입할 수 없다.
		//rc = new RemoteControl;
		
		//implements된 클래스의 객체를 생성
		rc = new Television();
		rc = new Audio();
		
		//개발코드//
		rc.turnOn();
		rc.turnOff();
	}
}
