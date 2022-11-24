package sec02.exam04_default_method;

public interface RemoteControl {
	//exam02 ����
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//exam03 ����
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//default �޼ҵ� - �������� ������ �ִ� �޼ҵ�
	//���������� default�� �޸� abstract�� Ǯ�� ���� ���̴� ������
	//�ڵ����� public�� �ٴ´�
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}
}
