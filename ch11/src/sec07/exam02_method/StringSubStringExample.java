package sec07.exam02_method;

public class StringSubStringExample {

	public static void main(String[] args) {
		//문자열 자르기 SubString
		String ssn = "123456-1234567";
		//0번 인덱스부터 6번 인덱스 전까지
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		//7번 인덱스부터 끝까지
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);

	}

}
