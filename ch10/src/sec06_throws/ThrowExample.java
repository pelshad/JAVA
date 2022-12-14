package sec06_throws;

public class ThrowExample {
	//예외떠넘기기(throws)
	//A메소드가 B를 호출 할 때 B메소드가 예외처리가 필요한 메소드라면
	//try catch문을 A에게 떠넘길 수 있다.
	public static void main(String[] args) {
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다");
		}
		
		
	}
	//메소드 뒤에 throws 발생할 예외를 붙여서 예외떠넘기기
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
	}
}
