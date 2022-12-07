package sec05.exam01_anonymous_extends;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		//Person 인스턴스
		anony.Field1.wake();
		
		//Person 익명 객체
		anony.Field2.wake();
		
		//Person 로컬 익명 객체 호출
		anony.method1();
		
		//메소드의 매개변수로 익명 객체 사용
		anony.method2(new Person() {
			int wakeUp = 8;
			void study() {
				System.out.println("스터디를 합니다.");
			}
			@Override
			void wake() {
				System.out.println(wakeUp + "시에 일어납니다.");
				study();
			}
		});

	}

}
