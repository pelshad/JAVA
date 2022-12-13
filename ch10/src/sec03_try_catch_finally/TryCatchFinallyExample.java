package sec03_try_catch_finally;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		/* try{
		 * 	����ó���� �ʿ��� �ڵ�
		 * } catch(���ܸ� e){
		 * 	���ܹ߻��� ��µ� �ڵ�
		 * } finally {
		 * 	���ܹ߻� ���ξ��� ������ �ڵ�
		 * }
		 */
		ExceptionErorr();
		System.out.println();
		ExceptionPass();
		
	}
	
	public static void ExceptionErorr() {
		try {
			//forName : ���ڿ��� Ŭ����ȭ�Ͽ� ����
			Class clazz = Class.forName("java.lang.String2");
			//�������� �ʴ� Ŭ������ ���� �߻�
			System.out.println("Ŭ������ ã�ҽ��ϴ�.");
			//����ó���� �ʿ��� �ڵ�� try catch�� ���� ������ ������ ����
		} catch(ClassNotFoundException e){
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		} finally {
			System.out.println("���α׷��� �����ϰ� �����մϴ�.");
		}
	}
	
	public static void ExceptionPass() {
		try {
			Class clazz2 = Class.forName("java.lang.String");
			System.out.println("Ŭ������ ã�ҽ��ϴ�.");
		} catch(ClassNotFoundException e){
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		} finally {
			System.out.println("���α׷��� �����ϰ� �����մϴ�.");
		}
	}

}
