package sec04.exam01_abstract_method_use;

public interface RemoteControl {
	//exam02 참고
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//exam03 참고
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//exam04 참고
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메소드
	//static을 붙여 메소드를 선언
	//실행 블록은 존재한다.
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
