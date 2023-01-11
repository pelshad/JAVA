package sec07.exam02_method;

public class StringToLowerUperCaseExample {
	public static void main(String[] args) {
		String str1 = "java Programming";
		String str2 = "JAVA Programming";
		
		//equals메소드는 대소문자를 구분하여 비교
		System.out.println(str1.equals(str2));
		
		//전부 소문자로 변경
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		
		//대소문자 구분없이 비교하는 equalsIgnoreCase
		System.out.println(str1.equalsIgnoreCase(str2));
	}
}
