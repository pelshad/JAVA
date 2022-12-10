package sec05.exam03_button_event;

public class Button {
	//매개변수로 들어온 객체가 대입될 인터페이스 필드
	OnClickListener listener;
	
	//매개변수로 들어온 객체를 인터페이스 필드로 선언
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	//구현 객체의 onClick()메소드 호출 메소드
	void touch() {
		listener.onClick();
	}
	
	//중첩 인터페이스
	interface OnClickListener{
		void onClick();
	}
	
}
