package sec07.exam02_method;

public class StringSubStringExample {

	public static void main(String[] args) {
		//���ڿ� �ڸ��� SubString
		String ssn = "123456-1234567";
		//0�� �ε������� 6�� �ε��� ������
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		//7�� �ε������� ������
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);

	}

}