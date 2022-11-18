package sec03.exam01_parent_constructor_call;

public class Student extends People{
	//부모 생성자가 매개변수값이 있기 때문에 부모 생성자(super())를 사용하지 않으면 컴파일 에러
	//부모 생성자 호출
	public int studentNo;
	
	public Student() {
		super("홍길동","123456-1234567");
	}
	
	//만약 외부의 값으로 넣고 싶은 경우
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		//super()랑 순서가 바뀌면 컴파일 에러
		this.studentNo = studentNo;
		System.out.println("자식 객체 생성 완료");
	}
	
	
	
	
	
	
}
