package verify.exam19;

class Account {
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	private int Balance = 0;
	
	
	public int getBalance() {
		return Balance;
	}
	
	public void setBalance (int num) {
		Balance = (num > MIN_BALANCE) 
				? (num < MAX_BALANCE) ? Balance : MAX_BALANCE
				: MIN_BALANCE;
	}
}
