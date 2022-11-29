package sec03.exam02_noname_implement_class;

import sec03.exam01_name_implement_class.RemoteControl;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			//익명 구현 객체에서 만들어진 필드 및 메소드는 실행 블록안에서만 사용 가능
			private int volume;
			public void otherMethod() {/*...*/};
			
			//인터페이스에서 생성된 추상 메소드는 전부 선언되어야 컴파일 에러가 안남
			@Override
			public void turnOn() {
				System.out.println("전원을 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("전원을 끕니다.");
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
				System.out.println("현재 볼륨 : " + this.volume);
			}
		};
		
		//rc.volume 인터페이스 블록 안에서만 사용가능
		rc.turnOn();
		
		//바이트 코드를 확인하는 법, 8.3인터페이스 구현(2) 22분부터 확인
	}

}
