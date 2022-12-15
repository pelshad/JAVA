package sec07_1_user_define_exception_get_message;

//유저가 만들 예외 클래스 만들기
//Exception 또는 RuntimeException을 상속받아 클래스를 생성
public class BalanceInsufficientException extends Exception {
	//기본 생성자 생성
	public BalanceInsufficientException() {};
	//예외 발생시 보낼 오류문 작성
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
