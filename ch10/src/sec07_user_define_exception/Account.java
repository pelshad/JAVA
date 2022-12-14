package sec07_user_define_exception;

public class Account {
	private long balance;
	
	public Account() {};
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	//예외발생 시 예외 떠넘기기
	public void widthdraw(int money) throws BalanceInsufficientException {
		if(balance<money) {
			//잔고 발생시 예외 발생
			throw new BalanceInsufficientException();
		}
		balance -= money;
	}
}
