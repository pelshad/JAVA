package sec04_multi_catch;

public class CatchByExceptionKindExample {

	public static void main(String[] args) {
		//���� try catch��
		//���ܰ� ���ÿ� �߻��� �� ó�� catch���� ����
		
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(result);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű����� ���� �����մϴ�.");
		} catch(NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
		}
		

	}

}
