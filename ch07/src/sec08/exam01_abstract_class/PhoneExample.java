package sec08.exam01_abstract_class;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone�� �߻� Ŭ������ ������ ���� �Ұ�
		//Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("ȫ�浿");
		smartPhone.turnOn(); // �߻� Ŭ������ �޼ҵ�
		smartPhone.internetSearch(); // �� Ŭ������ �޼ҵ�
		smartPhone.turnOff(); // �߻� Ŭ������ �޼ҵ�
	}
}
