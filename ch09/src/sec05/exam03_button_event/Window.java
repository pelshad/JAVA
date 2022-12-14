package sec05.exam03_button_event;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	//익명 구현 객체
	Button.OnClickListener listener = new Button.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	Window(){
		button1.setOnClickListener(listener);
		
		//매개 변수로 익명 구현 객체 대입
		button2.setOnClickListener(new Button.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("메세지를 보냅니다.");
		}
	});
	}
}
