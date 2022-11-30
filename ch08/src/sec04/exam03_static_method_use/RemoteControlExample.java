package sec04.exam03_static_method_use;

public class RemoteControlExample {
	public static void main(String[] args) {
		//static 메소드는 인터페이스명으로 바로 호출 가능하다.
		RemoteControl.changeBattery();
	}
}
