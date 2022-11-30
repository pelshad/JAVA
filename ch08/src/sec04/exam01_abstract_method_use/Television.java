package sec04.exam01_abstract_method_use;

public class Television implements RemoteControl{
	//인터페이스에서 선언된 추상메소드를 오버라이딩하지 않으면 컴파일 에러
	//이클립스에서 인터페이스의 추상메소드를 전부 호출하는 방법
	//1. source -> override/implement Methods
	//2. 에러가난 클래스명에 마우스를 올려 Add unimplemented methods 클릭

	private int volume;
	
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		//RemoteControl에서 MAX_VOLUME = 10, MIN_VOLUME = 0
		//으로 선언되어 있으므로 분기를 작성
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
	

}
