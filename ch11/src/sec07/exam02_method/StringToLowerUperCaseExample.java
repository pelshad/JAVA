package sec07.exam02_method;

public class StringToLowerUperCaseExample {
	public static void main(String[] args) {
		String str1 = "java Programming";
		String str2 = "JAVA Programming";
		
		//equals�޼ҵ�� ��ҹ��ڸ� �����Ͽ� ��
		System.out.println(str1.equals(str2));
		
		//���� �ҹ��ڷ� ����
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		
		//��ҹ��� ���о��� ���ϴ� equalsIgnoreCase
		System.out.println(str1.equalsIgnoreCase(str2));
	}
}
