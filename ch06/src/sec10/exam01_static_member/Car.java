package sec10.exam01_static_member;

public class Car {
	// static 사용의 판단 기준
	// 필드
	// 객체마다 달라 질 수 있는 값 :: 인스턴스 필드
	// 공용 데이터 :: 정적 필드
	
	String color;
	static double maxSpeed = 250;
	//color의 경우 Car 인스턴스 마다 다를 수 있 수 있으므로 static을 안씀
	//maxSpeed의 경우 모든 차의 최고 속도가 250이라는 가정이라면
	//고정된 값이니 static으로 지정(메모리 절약됨!)
	
	// 메소드
	// 인스턴스 필드의 값으로 작업해야할 메소드 :: 인스턴스 메소드
	// 인스턴스 필드의 값으로 작업하지 않는 메소드 :: 정적 메소드
	
	void setColor(String color) {
		this.color = color;
	}
	static int plus(int x, int y) {
		return x + y;
	}
	// setColor의 위의 인스턴스 필드의 값을 사용하기 때문에 static을 사용안함
	// 되려 this로 인해 컴파일 에러가 뜸
	// 아래 plus메소드의 x,y값은 인스턴스 필드가 존재하지 않기 때문에 static을 사용
}
