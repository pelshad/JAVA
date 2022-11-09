package sec10.exam04_singleton;

public class Singleton {
	//�̱��� ����� ��
	//1. Ŭ���� �ڽ��� Ÿ������ �����ʵ带 �����ϰ�, �ڽ��� ��ü�� ������ �ʱ�ȭ�Ѵ�.
	private static Singleton singleton = new Singleton();
	
	//2. �ܺο��� new �����ڷ� �����ڸ� ȣ�� �� �� ������ ���´�
	private Singleton() {}
	
	//3. �ܺο��� ȣ���� �� �ִ� ���� �޼ҵ带 �����.
	static Singleton getInstance() {
		return singleton;
	}
}
