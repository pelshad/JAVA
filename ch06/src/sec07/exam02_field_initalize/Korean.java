package sec07.exam02_field_initalize;

public class Korean {
	String nation = "대한민국";
	String name;
	String ssn;
	
	public Korean(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
	}
	
	// 객체를 프린트 해주는 메소드
	public String toString() {
		return "(nation : " + nation + ")" + "(name : " + name + ")" + "(ssn : " + ssn + ")";
	}
}
