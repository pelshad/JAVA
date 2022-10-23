package sec04.exam02_string_concat;

public class stringConcatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "JDK" + 6.0;
		String str2 = str1 + "특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;
		System.out.println(str3); // +연산자 순서상 왼쪽부터 더해져 숫자들이 전부 문자열로
		
		String str4 = 3 + 3.0 +"JDK";
		System.out.println(str4); //왼쪽 수부터 더해지고 문자열 결합이 일어남
	}

}
