package sec08.exam01_abstract_class;

// abstract :: �߻�ȭ
public abstract class Phone {
	//�߻�Ŭ������ �ν��Ͻ��� ���� �� ���� ������ �ڽĿ��� �� ���� �����ִ� �͸� ����
	//�����ؾ��� Ŭ������ ����(�԰�)�� �����ϴ� Ŭ����
	
	public String owner;
	
	//�߻� Ŭ���� ��ü�� �ν��Ͻ� ������ ��������
	//�ڽ� Ŭ������ �����ڸ� ���� �����ڰ� ����� ������
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("�� ������ �մϴ�");
	}
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
}
