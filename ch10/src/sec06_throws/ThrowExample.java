package sec06_throws;

public class ThrowExample {
	//���ܶ��ѱ��(throws)
	//A�޼ҵ尡 B�� ȣ�� �� �� B�޼ҵ尡 ����ó���� �ʿ��� �޼ҵ���
	//try catch���� A���� ���ѱ� �� �ִ�.
	public static void main(String[] args) {
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�");
		}
		
		
	}
	//�޼ҵ� �ڿ� throws �߻��� ���ܸ� �ٿ��� ���ܶ��ѱ��
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
	}
}
