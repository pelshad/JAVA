package sec04.exam01_nestedinterface;

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
