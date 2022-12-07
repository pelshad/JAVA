package sec05.exam02_anonymous_implements;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		//익명 구현 객체에서 메소드 호출
		anony.field.turnOn();
		anony.field.turnOff();
		
		//익명 구현 로컬 객체 호출
		anony.method1();
		
		//익명 구현 객체를 매개변수로 넣은 메소드
		anony.method2(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("비디오를 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("비디오를 끕니다.");
			}
		});
		
	}

}
