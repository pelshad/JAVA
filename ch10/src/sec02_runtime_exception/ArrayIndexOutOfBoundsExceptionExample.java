package sec02_runtime_exception;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		//���� �޼ҵ��� �Ķ���� ������ args[0]�� ȫ�浿�� �־�� ����
		String data1 = args[0];
		//args[1]���� �ƹ� ���� ���� ������ �迭 ������ ��� ���� ������ ����
		String data2 = args[1];
		
		//ArrayIndexOutOfBoundsException ���� �߻�
		System.out.println("args[0] : " + data1);
		System.out.println("args[1] : " + data2);
		
		
	}
}
