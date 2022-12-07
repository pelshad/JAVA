package sec05.exam03_button_event;

public class Button {
	//�Ű������� ���� ��ü�� ���Ե� �������̽� �ʵ�
	OnClickListener listener;
	
	//�Ű������� ���� ��ü�� �������̽� �ʵ�� ����
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	//���� ��ü�� onClick()�޼ҵ� ȣ�� �޼ҵ�
	void touch() {
		listener.onClick();
	}
	
	//��ø �������̽�
	interface OnClickListener{
		void onClick();
	}
	
}
