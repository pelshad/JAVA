package sec04.exam01_abstract_method_use;

public class Audio implements RemoteControl{
	//�������̽����� ����� �߻�޼ҵ带 �������̵����� ������ ������ ����
	//��Ŭ�������� �������̽��� �߻�޼ҵ带 ���� ȣ���ϴ� ���
	//1. source -> override/implement Methods
	//2. �������� Ŭ������ ���콺�� �÷� Add unimplemented methods Ŭ��

	private int volume;
	
	
	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		//RemoteControl���� MAX_VOLUME = 10, MIN_VOLUME = 0
		//���� ����Ǿ� �����Ƿ� �б⸦ �ۼ�
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� Audio ���� : " + this.volume);
	}
	

}
