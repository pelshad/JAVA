package sec03.exam03_accuracy;

public class fromIntToDouble {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		num2 = (int) num3; //값 손실 발생
		//int는 32비트에 값을 담지만 float는 23비트(가수부)에 저장하기 때문에 손실이 생김 
		
		int result = num1 - num2;
		System.out.println(result);

	}

}
