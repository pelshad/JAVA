package sec11.exam01_final;

public class Person {
	// final field
	// 최종적인 값을 갖고 있는 필드(변경 불가)
	// 설정 방법
	// 1. 필드 선언시(이후 생성자에서도 변경 불가)
	// 2. 생성자
	
	final String nation = "Korea";
	// 1의 방법으로 선언시에 값을 넣음
	final String ssn;
	String name;
	
	public Person(String ssn, String name){
		this.ssn = ssn;
		// 2의 방법으로 생성자로 넣음
		this.name = name;
		//nation = "America" 컴파일 에러
	}
	
	public String toString() {
		return "국가 : " + nation + " 주민번호 : " + ssn + " 이름 : " + name;
	}
}
