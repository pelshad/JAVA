package sec05.exam01_anonymous_extends;

public class Anonymous{
	//Person 클래스로 인스턴스 생성
	Person Field1 = new Person();
	
	//Person 클래스로 익명 자식 객체 생성
	//부모객체 변수명 = new 부모객체() { };
	Person Field2 = new Person() {
		// wake이외의 값은 익명 자식 객체의 필드와 메소드이기에
		// 해당 블록에서 벗어나 사용 할 수 없다.
		String studentNo;
		int wakeUp = 6;
		void work() {
			System.out.println("출근합니다.");
		}
		@Override
		void wake() {
			System.out.println(wakeUp + "시에 일어납니다.");
		}
	};
	
	void method1() {
		//로컬변수
		Person localVar = new Person() {
			String studentNo;
			int wakeUp = 7;
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			void wake() {
				System.out.println(wakeUp + "시에 일어납니다.");
				walk();
			}
		};
		localVar.wake();
	}
	//매개변수
	void method2(Person person) {
		person.wake();
	}
}
