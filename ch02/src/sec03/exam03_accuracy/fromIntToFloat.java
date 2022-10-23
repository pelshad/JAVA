package sec03.exam03_accuracy;

public class fromIntToFloat {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2;
		num2 = (int) num3; //값 손실 발생하지 않음
		//double의 가수부는 int의 값 범위보다 넓어서 손실 X
		
		int result = num1 - num2;
		System.out.println(result);

	}

}
