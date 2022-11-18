package sec03.exam01_parent_constructor_call;

public class People {
	public String name;
	public String ssn;
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		System.out.println("부모 객체 생성 완료");
	}
	//기본 생성자는 없는 상태
	//객체의 생성 순서
	//실행 클래스에서 객체 생성시 부모객체생성 -> 자식객체생성
}
