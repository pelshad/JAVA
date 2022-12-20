package sec03.exam06_finalize;

public class Finalize {
	/*
	 	객체 소멸자(finalize())
	 	1. GC는 객체를 소멸하기 직전에 마지막으로 객체의 소멸자(finalize())를 실행시킨다.
	 	2. Object의 finalize()는 기본저긍로 실행 내용이 없다.
	 	3. 객체가 소멸되기 전에 실행할 코드가 있다면 Object의 finalize()를 재정의한다.
	 	4. 될 수 있다면 소멸자를 사용하지 않는 것이 좋다.
	 	 - GS는 메모리의 모든 쓰레기 객체를 소멸하지 않는다
	 	   메모리의 상태를 보고 일부만 소멸시키기 때문에 남아 있는 객체는 finalize()를 호출하지 않음
	 	 - 또한 GC의 구동 시점이 일정하지 않다.
	 	   메모리가 부족할 때 그리고 cpu가 한가할 때 jvm에 의해서 자동실행
	 	
	 */
}
