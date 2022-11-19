package sec07.exam02_promotion_access;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child;
		
		//부모의 메소드 호출
		parent.method1();
		//오버라이딩 된 자식의 메소드가 호출됨
		parent.method2();
		//부모클래스로 생성된 인스턴스이기 때문에 child의 method3은 호출 안됨
		//parent.method3();
	}
	
}
