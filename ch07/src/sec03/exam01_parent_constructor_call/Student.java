package sec03.exam01_parent_constructor_call;

public class Student extends People{
	//�θ� �����ڰ� �Ű��������� �ֱ� ������ �θ� ������(super())�� ������� ������ ������ ����
	//�θ� ������ ȣ��
	public int studentNo;
	
	public Student() {
		super("ȫ�浿","123456-1234567");
	}
	
	//���� �ܺ��� ������ �ְ� ���� ���
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		//super()�� ������ �ٲ�� ������ ����
		this.studentNo = studentNo;
		System.out.println("�ڽ� ��ü ���� �Ϸ�");
	}
	
	
	
	
	
	
}
