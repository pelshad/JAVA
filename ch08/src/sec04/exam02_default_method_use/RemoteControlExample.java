package sec04.exam02_default_method_use;

public class RemoteControlExample {
	public static void main(String[] args) {
		//default 메소드는 인터페이스에서 직접 호출 할 수 없다.
		// RemoteControl.setMute(true);
		RemoteControl rc = null;
		
		//default 메소드가 override되지 않은 class
		rc = new Television();
		rc.setMute(true);
		
		//default 메소드가 override된 class
		rc = new Audio();
		rc.setMute(true);

	}
}
