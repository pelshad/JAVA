package sec07_1_user_define_exception_get_message;

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
