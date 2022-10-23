package sec04.exam01_arithmetic;

public class charOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1; //유티코드 65 + 1 *리터럴 타입으로 산술하면 char로 출력
		System.out.println(c1);
		
		char c2 = 'A';
		//char c3 = c2 + 1; c2가 int로 변하게 되어 컴파일 에러 *변수 타입으로 산술하면 int로 출력
		int result = c2 + 1;
		System.out.println(result);
		
		char c3 = (char) result;
		System.out.println(c3);

	}

}
