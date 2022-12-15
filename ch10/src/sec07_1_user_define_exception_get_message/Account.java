package sec07_1_user_define_exception_get_message;

public class Account {
	private long balance;
	
	public Account() {};
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	//���ܹ߻� �� ���� ���ѱ��
	public void widthdraw(int money) throws BalanceInsufficientException {
		if(balance<money) {
			//�ܰ� �߻��� ���� �߻�
			throw new BalanceInsufficientException("�ܰ���� : " + (money-balance)
					+ " ���ڶ�");
		}
		balance -= money;
	}
}
