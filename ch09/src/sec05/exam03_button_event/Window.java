package sec05.exam03_button_event;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	//�͸� ���� ��ü
	Button.OnClickListener listener = new Button.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("��ȭ�� �̴ϴ�.");
		}
	};
	
	Window(){
		button1.setOnClickListener(listener);
		
		//�Ű� ������ �͸� ���� ��ü ����
		button2.setOnClickListener(new Button.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("�޼����� �����ϴ�.");
		}
	});
	}
}
