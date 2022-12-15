package sec07_1_user_define_exception_get_message;

public class AccountExample {

	public static void main(String[] args) {
		Account act = new Account();
		//�����ϱ�
		act.deposit(10000);
		System.out.println("���ݾ� : " + act.getBalance());
		//����ϱ�
		try {
			act.widthdraw(30000);
			//�׳� �ۼ��� ����ó���� ���� �ʾұ� ������ ���� �߻�
			System.out.println("���ݾ� : " + act.getBalance());
			//���ݾ��� �Ѵ� ���� ������ ���ܹ߻�
		} catch (BalanceInsufficientException e) {
			//getMessage()�޼ҵ带 ���� ���� �޼��� ���
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			
			//���� �߻� �α� �� �޼��� ���
			System.out.println(e.toString());
			
			System.out.println();
			//�߻��� ���� �α׸� ��� ���(������ �� ���� �����)
			e.printStackTrace();
		}

	}

}
