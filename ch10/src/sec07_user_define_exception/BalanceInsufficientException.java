package sec07_user_define_exception;

//������ ���� ���� Ŭ���� �����
//Exception �Ǵ� RuntimeException�� ��ӹ޾� Ŭ������ ����
public class BalanceInsufficientException extends Exception {
	//�⺻ ������ ����
	public BalanceInsufficientException() {};
	//���� �߻��� ���� ������ �ۼ�
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
