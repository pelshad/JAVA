package vertify.exam07;

public class PasswordException extends Exception{
	public PasswordException () {};
	public PasswordException(String message) {
		super(message);
		System.out.println("��й�ȣ�� Ʋ���ϴ�.");
	}
}
