package sec02.exam04_default_method;

public interface RemoteControl {
	//exam02 참고
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//exam03 참고
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//default 메소드 - 실행블록을 가지고 있는 메소드
	//접근제한자 default와 달리 abstract를 풀기 위해 붙이는 제한자
	//자동으로 public이 붙는다
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
}
