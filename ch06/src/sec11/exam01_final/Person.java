package sec11.exam01_final;

public class Person {
	// final field
	// �������� ���� ���� �ִ� �ʵ�(���� �Ұ�)
	// ���� ���
	// 1. �ʵ� �����(���� �����ڿ����� ���� �Ұ�)
	// 2. ������
	
	final String nation = "Korea";
	// 1�� ������� ����ÿ� ���� ����
	final String ssn;
	String name;
	
	public Person(String ssn, String name){
		this.ssn = ssn;
		// 2�� ������� �����ڷ� ����
		this.name = name;
		//nation = "America" ������ ����
	}
	
	public String toString() {
		return "���� : " + nation + " �ֹι�ȣ : " + ssn + " �̸� : " + name;
	}
}
