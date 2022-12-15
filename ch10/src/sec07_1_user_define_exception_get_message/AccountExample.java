package sec07_1_user_define_exception_get_message;

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
			//getMessage()메소드를 통해 예외 메세지 출력
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			
			//예외 발생 로그 및 메세지 출력
			System.out.println(e.toString());
			
			System.out.println();
			//발생한 예외 로그를 모두 출력(개발할 때 많이 사용함)
			e.printStackTrace();
		}

	}

}
