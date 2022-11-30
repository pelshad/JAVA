package sec04.exam01_abstract_method_use;

public interface RemoteControl {
	//exam02 ����
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//exam03 ����
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//exam04 ����
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	//���� �޼ҵ�
	//static�� �ٿ� �޼ҵ带 ����
	//���� ����� �����Ѵ�.
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
