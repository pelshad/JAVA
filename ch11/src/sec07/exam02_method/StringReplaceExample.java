package sec07.exam02_method;

public class StringReplaceExample {

	public static void main(String[] args) {
		// replace()
		// ���� ���ڿ��� �ٲپ� ���ο� ���ڿ��� ����(���� ���ڿ� ��ü�� �ٲٴ°� X)
		String oldStr = "�ڹ� ������";
		String newStr = oldStr.replace("�ڹ�", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
