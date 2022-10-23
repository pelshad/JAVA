package sec04.exam01_arithmetic;

public class checkOverflowExample {

	public static void main(String[] args) {
		try {
			int result = safeAdd(200000, 20000);
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("�����÷ο� �߻��Ͽ� ��Ȯ�ϰ� ����� �� ����");
		}
	}

	public static int safeAdd(int left, int right) {
		if( right > 0) {
			if( left > (Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		} else {
			if( left < (Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		}
		return left + right;
	}
}
