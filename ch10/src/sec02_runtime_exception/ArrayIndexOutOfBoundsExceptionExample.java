package sec02_runtime_exception;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		//메인 메소드의 파라미터 값으로 args[0]엔 홍길동을 넣어둔 상태
		String data1 = args[0];
		//args[1]에는 아무 값도 없기 때문에 배열 범위를 벗어난 값을 변수에 담음
		String data2 = args[1];
		
		//ArrayIndexOutOfBoundsException 예외 발생
		System.out.println("args[0] : " + data1);
		System.out.println("args[1] : " + data2);
		
		
	}
}
