package sec13.exam02_constructor_access.package1;

public class ConstructorA {
	ConstructorA a1 = new ConstructorA(true);
	ConstructorA a2 = new ConstructorA();
	ConstructorA a3 = new ConstructorA("private");
	
	public ConstructorA(boolean b) {}
	//public �������� ������ A
	//�ٸ� ��Ű���� Ŭ�������� ���� ����
	
	ConstructorA() {}
	//default �������� ������ A
	//���� ��Ű���� Ŭ���������� ���� ����
	
	private ConstructorA(String s) {}
	//private �������� ������ A
	//���� Ŭ���������� ���� ����
	
} 
