package sec04_multi_catch;

public class CatchOrderExample {

	public static void main(String[] args) {
		//�������� ���� ���� ����
		//catch������ ������ ���� Exception e����
		//������ �� ���� Ư�� Exception�� ���� �ξ�� �ش� ���ܿ� ����
		//catch���� ���� �߻��Ѵ�.
		
		incorrectMultiException();
		rightMultiException();
		
	}
	
	public static void incorrectMultiException() {
		try {
			String[] args = {"0", "0"};
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(result);
		} catch(Exception e) {
			System.out.println("��� ���ܰ� ���� ��µ˴ϴ�.");
		} catch(NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ�� �� ���� ���ܰ� ��µ˴ϴ�.");
		}
	}
	
	public static void rightMultiException() {
		try {
			String[] args = {"0", "0"};
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(result);
		} catch(NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ�� �� ���� ���ܰ� ���� ��µ˴ϴ�.");
		} catch(Exception e) {
			System.out.println("��� ���ܰ� ��µ˴ϴ�.");
		}
	}
	
}
