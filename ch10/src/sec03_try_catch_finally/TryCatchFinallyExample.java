package sec03_try_catch_finally;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		/* try{
		 * 	예외처리가 필요한 코드
		 * } catch(예외명 e){
		 * 	예외발생시 출력될 코드
		 * } finally {
		 * 	예외발생 여부없이 실행할 코드
		 * }
		 */
		ExceptionErorr();
		System.out.println();
		ExceptionPass();
		
	}
	
	public static void ExceptionErorr() {
		try {
			//forName : 문자열을 클래스화하여 리턴
			Class clazz = Class.forName("java.lang.String2");
			//존재하지 않는 클래스라 예외 발생
			System.out.println("클래스를 찾았습니다.");
			//예외처리가 필요한 코드라 try catch를 하지 않으면 컴파일 에러
		} catch(ClassNotFoundException e){
			System.out.println("클래스가 존재하지 않습니다.");
		} finally {
			System.out.println("프로그램을 안전하게 종료합니다.");
		}
	}
	
	public static void ExceptionPass() {
		try {
			Class clazz2 = Class.forName("java.lang.String");
			System.out.println("클래스를 찾았습니다.");
		} catch(ClassNotFoundException e){
			System.out.println("클래스가 존재하지 않습니다.");
		} finally {
			System.out.println("프로그램을 안전하게 종료합니다.");
		}
	}

}
