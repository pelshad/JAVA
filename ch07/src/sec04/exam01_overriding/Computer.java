package sec04.exam01_overriding;

public class Computer extends Calculator {
	//Override 재정의한 메소드가 맞는지 확인하는 어노테이션
	//만약 부모와 다른 메소드형태를 가질경우 오버라이드되는게 아닌 새로운 메소드를 선언하게 됨
	//따라서, 메소드 명칭 및 매개변수 등을 부모와 비교하여 동일하지 않으면 컴파일 에러가 나게하는 어노테이션
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 메소드입니다");
		return Math.PI*r*r;
	}
	
	//이클립스에서 오버라이딩하는 방법
	//1. 직접 정의
	//2. Source -> Override/Implement Methods
	//3. ctrl + space -> 오버라이딩할 메소드 선택
}
