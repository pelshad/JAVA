package sec05.exam02_anonymous_implements;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		//�͸� ���� ��ü���� �޼ҵ� ȣ��
		anony.field.turnOn();
		anony.field.turnOff();
		
		//�͸� ���� ���� ��ü ȣ��
		anony.method1();
		
		//�͸� ���� ��ü�� �Ű������� ���� �޼ҵ�
		anony.method2(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("������ �մϴ�.");
			}
			@Override
			public void turnOff() {
				System.out.println("������ ���ϴ�.");
			}
		});
		
	}

}
