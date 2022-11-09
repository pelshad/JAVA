package sec10.exam03_static_be_careful;

public class Car {
	/* 정적 메소드와 정적 블록 작성시 주의점
	 * 이들 메소드, 블록 내부에 인스턴스 필드, 메소드를 사용 할 수 없다
	 * (this 또한 인스턴스를 위한 기능이니 사용 불가!)
	 */
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		//speed = 60;
		//run();
		//main 메소드 역시 정적 메소드이기 때문에 위의 인스턴스 값을 바로 쓰면 컴파일 에러
		
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}
}
