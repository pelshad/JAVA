package sec08.exam02_abstract_method;

public abstract class Animal {
	public String kind;
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	};
	//�߻� �޼ҵ�� �߻� Ŭ���������� �ۼ� ����
	//�߻� �޼ҵ�� ��ü Ŭ�������� �ݵ�� �ۼ��Ǿ�� �Ѵ�.
	public abstract void sound();
}
