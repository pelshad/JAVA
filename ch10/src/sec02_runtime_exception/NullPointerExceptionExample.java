package sec02_runtime_exception;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		//���ڿ� Ÿ�� ��ü�� data�� null�� ����
		String data = null;
		//toString ��ü�� ���� ������ ���� ���ڿ��� ����� �����ϴ� �޼ҵ�
		//������ data�� ���� null�̱� ������ ���ܹ߻�
		//NullPointerException
		System.out.println(data.toString());
	}
}
