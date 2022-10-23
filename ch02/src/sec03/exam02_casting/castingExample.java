package sec03.exam02_casting;

public class castingExample {

	public static void main(String[] args) {
		//강제형 변환
		int intValue = 44032; //'가'의 유니코드 번호
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);//int의 범위 내라 문제없이 형변환됨
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue); //정수부인 3만 출력됨

	}

}
