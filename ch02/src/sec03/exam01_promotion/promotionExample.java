package sec03.exam01_promotion;

public class promotionExample {

	public static void main(String[] args) {
		
		byte byteValue = 10;
		int intValue = byteValue; //자동 타입 변환
		System.out.println(intValue); //int 타입인 10 출력

		char charValue = '가';
		intValue = charValue;
		System.out.println(intValue); // 가의 유니코드 번호 출력

		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue); //long 타입인 10 출력
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);//double 타입인 200.0 출력
		
		longValue = 1000000000000L;
		float floatValue = longValue; //4바이트인 float이지만 부동소수점을 이용하여 더 많은 범위의 수를 저장할 수 있기 때문에 대입가능
		System.out.println(floatValue);
		
		
	}

}
