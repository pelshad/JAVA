package sec02_runtime_exception;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		//문자열 타입 객체인 data에 null값 선언
		String data = null;
		//toString 객체가 가진 정보나 값을 문자열로 만들어 리턴하는 메소드
		//하지만 data의 값은 null이기 때문에 예외발생
		//NullPointerException
		System.out.println(data.toString());
	}
}
