package sec04.exam02_default_method_use;

public class RemoteControlExample {
	public static void main(String[] args) {
		//default �޼ҵ�� �������̽����� ���� ȣ�� �� �� ����.
		// RemoteControl.setMute(true);
		RemoteControl rc = null;
		
		//default �޼ҵ尡 override���� ���� class
		rc = new Television();
		rc.setMute(true);
		
		//default �޼ҵ尡 override�� class
		rc = new Audio();
		rc.setMute(true);

	}
}
