package vertify.exam07;

public class PasswordException extends Exception{
	public PasswordException () {};
	public PasswordException(String message) {
		super(message);
		System.out.println("비밀번호가 틀립니다.");
	}
}
