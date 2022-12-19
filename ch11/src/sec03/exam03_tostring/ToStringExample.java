package sec03.exam03_tostring;

import java.util.Date;

public class ToStringExample {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		
		//obj1의 toString메소드가 자동으로 호출된다.
		System.out.println(obj1);
		//Date타입 객체인 obj2의 toString메소드는 기본적으로 오버라이딩되어 날짜 출력
		System.out.println(obj2);
	}

}
