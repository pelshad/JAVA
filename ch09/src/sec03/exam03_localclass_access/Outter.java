package sec03.exam03_localclass_access;

public class Outter {
	//자바7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
		//자바7 이전에는 매개변수와 지역변수에 final을 붙이지 않으면 에러
		//따라서 값을 변경 할 수 없다.
		//arg = 10;
		//localVariable = 10;
		class Inner{
			void method() {
				//컴파일러에서 각 매개변수와 지역변수를 메소드 안에 복사하여 사용한다.
				//int arg = 10;
				//int localVariable = 10;
				int reseult = arg + localVariable;
			}
		}
		//이렇게 사용되는 이유
		//method1이 종료가 되면 매개변수와 로컬변수는 stack에서 사라지게 되어
		//Inner 클래스에서 그 값을 이용하지 못하게 된다.
		//하지만 Inner 클래스는 heap에 남아 실행 되어야 하기에 final을 통해
		//그 값을 복사하여 사용(final을 쓰지 않으면 복사를 하지 않음)
	}
	
	//자바8 이후
	public void method2(int arg) {
		int localVariable = 1;
		int localVariable2 = 10;
		
		//자바 8 이후 final을 붙이지 않아도 컴파일 에러가 생기지 않음
		//하지만 각 매개변수와 로컬변수는 final 속성을 자동으로 가지게 된다.
		//그래서 변수의 값을 변경 할 수 없다.
		
		//arg = 10;
		//localVariable = 10;
		
		//로컬 클래스에서 사용되지 않은 localVariable2 변수는 final 속성을
		//가지지 않는다.
		localVariable2 = 20;
		
		class Inner{
			//컴파일러에서 각 매개변수와 지역변수를 클래스 안에 복사하여 사용한다.
			//int arg = 10;
			//int localVariable = 10;
			void method() {
				int reseult = arg + localVariable;
			}
		}
	}
}
