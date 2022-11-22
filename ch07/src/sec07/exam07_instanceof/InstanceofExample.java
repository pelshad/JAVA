package sec07.exam07_instanceof;

public class InstanceofExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			//instanceof
			//parent 객체가 Child 타입으로 만들어진건지 체크하는 함수
			
			
			//이렇게만 작성해두면 추후 child 타입의 객체가 오지 않으면
			//ClassCastException 발생
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
		
	}
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	public static void main(String[] args) {
		Parent parentA = new Child();
		Parent parentB = new Parent();
		
		method1(parentA);//변환됨
		method1(parentB);//변환안됨
		method2(parentA);//변환됨
		//method2(parentA); //ClassCastException
	}
}
