package sec07_user_define_exception;

public class AccountExample {

	public static void main(String[] args) {
		Account act = new Account();
		//예금하기
		act.deposit(10000);
		System.out.println("예금액 : " + act.getBalance());
		//출금하기
		try {
			act.widthdraw(30000);
			//그냥 작성시 예외처리를 하지 않았기 때문에 에러 발생
			System.out.println("예금액 : " + act.getBalance());
			//예금액을 넘는 값을 적으면 예외발생
		} catch (BalanceInsufficientException e) {
			e.printStackTrace();
		}

	}

}
