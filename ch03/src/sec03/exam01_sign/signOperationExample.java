package sec03.exam01_sign;

public class signOperationExample {
	public static void main(String[] args) {
		int x = 100;
		int result1 = +x;
		int result2 = -x;
		
		System.out.println(result1);
		System.out.println(result2);
		
		short s = 100;
		//short result3 = -s; 부호연산자가 붙으면 산출되는 값은 int로 출력되기 때문에 에러
		int result3 = -s;
		System.out.println(result3);
		
		
	}
}
