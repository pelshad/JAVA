package sec03.exam01_parent_constructor_call;

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-1234567", 1);
		//부모한테 물여받은 값
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		//본인의 값
		System.out.println("studentNo : " + student.studentNo);
	}
}
