package sec04.exam02_string_concat;

public class stringConcatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "JDK" + 6.0;
		String str2 = str1 + "Ư¡";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;
		System.out.println(str3); // +������ ������ ���ʺ��� ������ ���ڵ��� ���� ���ڿ���
		
		String str4 = 3 + 3.0 +"JDK";
		System.out.println(str4); //���� ������ �������� ���ڿ� ������ �Ͼ
	}

}
