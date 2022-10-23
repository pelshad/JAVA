package sec04.exam04_logical;

public class logicalOperatorExample {

	public static void main(String[] args) {
		int charCode = '9';
		
		if(charCode>=65 && (charCode<=90)) {
			System.out.println("대문자입니다");
		}
		
		if(charCode>=97 && (charCode<=122)) {
			System.out.println("소문자입니다");
		}
		
		if(!(charCode<48) && !(charCode>57)) {
			System.out.println("0~9 숫자입니다.");
		}
		
		int value = 6;
		if((value%2==0) | (value%3==0)) {
			System.out.println("2 또는 3의 배수입니다."); 
		}
		if((value%2==0) || (value%3==0)) {
			System.out.println("2 또는 3의 배수입니다.");
		}
	}

}
