package sec02.exam03_abstract_method;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// �������̽��� �޼ҵ�� �⺻������ �߻� �޼ҵ�� ����ȴ�.
	// ���ε� ���������ڸ� ������ �ʾƵ� public abstract�� �ڵ������� �پ�����
	// �߻�޼ҵ��̱� ������ �������� ���� ������ �ʴ´�.
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
