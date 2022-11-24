package sec02.exam03_abstract_method;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 인터페이스의 메소드는 기본적으로 추상 메소드로 선언된다.
	// 별로도 접근제한자를 붙이지 않아도 public abstract가 자동적으로 붙어있음
	// 추상메소드이기 때문에 실행블록을 따라 붙이지 않는다.
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
