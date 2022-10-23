package sec03.exam04_operation;

public class operationPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		//byte byteValue1 + byteValue2; byte타입에서 연산이 들어가면 int로 변환되어 컴파일 에러
		//int 이하의 바이트를 가진 수는 전부 int로 전환된다
		
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		
		//char charValue3 = charValue1 + charValue2; int타입으로 전환 되어 컴파일 에러
		int intValue2 = charValue1 + charValue2;
		System.out.println(intValue2);
		System.out.println((char) intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4; 
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0;실수 리터럴이 있기 때문에 컴파일 에러가 뜸
		//int intValue6 = intValue5/4.0; 위와 동일
		double doubleValue = intValue5/4.0;
		System.out.println(doubleValue);
	}
}
