package sec07_user_define_exception;

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
			e.printStackTrace();
		}

	}

}
