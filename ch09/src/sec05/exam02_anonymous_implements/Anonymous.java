package sec05.exam02_anonymous_implements;

public class Anonymous {
	//익명 구현 객체 생성
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	//익명 구현 로컬 객체
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("라디오를 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("라디오를 끕니다.");
			}
		};
		localVar.turnOn();
		localVar.turnOff();
	}
	//메소드의 매개변수로 익명 구현 객체
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
