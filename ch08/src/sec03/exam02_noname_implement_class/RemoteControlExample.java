package sec03.exam02_noname_implement_class;

import sec03.exam01_name_implement_class.RemoteControl;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			//�͸� ���� ��ü���� ������� �ʵ� �� �޼ҵ�� ���� ��Ͼȿ����� ��� ����
			private int volume;
			public void otherMethod() {/*...*/};
			
			//�������̽����� ������ �߻� �޼ҵ�� ���� ����Ǿ�� ������ ������ �ȳ�
			@Override
			public void turnOn() {
				System.out.println("������ �մϴ�.");
			}

			@Override
			public void turnOff() {
				System.out.println("������ ���ϴ�.");
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
				System.out.println("���� ���� : " + this.volume);
			}
		};
		
		//rc.volume �������̽� ��� �ȿ����� ��밡��
		rc.turnOn();
		
		//����Ʈ �ڵ带 Ȯ���ϴ� ��, 8.3�������̽� ����(2) 22�к��� Ȯ��
	}

}
