package sec02.exam02_constant_field;

public interface RemoteControl {
	//�������̽��� �ʵ�� �ڵ����� ����� �����ȴ�
	//(public static final�� ���� ������ �ʾƵ� ���� ȿ���� ��)
	//���� �ʵ���� ����� ���鶧�� ���� �빮�ڿ� _�� �̿��Ͽ� ������ �ȴ�.
	//class�� ����� �޸� ����� ���ÿ� ���� ����Ѵ�.
	
	//int MAX_VALUME; ������ ����
	
	//static ����� ���� �������� �ʱ� ������ ����� ���� ���� �ִ� �͵� X
	/* int MIN_VOLUME;
	static {MIN_VOLUME = 0;} */
	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
}
