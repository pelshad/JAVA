package sec07.exam01_why_default_method;

public interface MyInterface {
	//왜 default 메소드를 사용하는가?
	//초기 구현 클래스들은 메소드1만 구현하여 사용하였다.
	public void method1();
	//후에 추가로 새로운 메소드가 필요한 경우 추상 메소드를 추가해버리면
	//기존에 있던 모든 구현 클래스에 override가 필요해짐
	//(구현 클래스의 수가 적다면 추상 메소드를 추가하고 override해도 되지만
	//기존에 있던 구현 클래스가 너무 많거나 해당 메소드가 다른 사람이 작성 한 것이라
	//소스 파일이 없고, 바이트 코드 파일만 있다면 수정이 힘듦)
	//따라서 기존 구현 클래스에 지장을 주지 않으면서 새로운 구현 클래스에
	//override할 수 있도록 default메소드를 추가해준다.
	default void method2() {
		System.out.println("Interface method2 실행");
	};
}
