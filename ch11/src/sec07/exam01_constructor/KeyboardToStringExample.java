package sec07.exam01_constructor;

public class KeyboardToStringExample {

	public static void main(String[] args) throws Exception {
		byte[] bytes = new byte[100];
		System.out.print("�Է� : ");
		//Ű����κ��� ���� ���ڿ� ���� byte������ ����
		int readByteNo = System.in.read(bytes);
		
		//bytes �迭 0���� readByteNo-2������ ���ڿ��� ��ȯ
		//-2�� �ϴ� ������ �Էµ� �κп��� ���͸� ġ�� \r \n�� ����Ʈ ���� �迭�� �����
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
	}

}
