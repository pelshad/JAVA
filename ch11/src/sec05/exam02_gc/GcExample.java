package sec05.exam02_gc;

public class GcExample {

	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1);
		emp = null;
		emp = new Employee(2);
		emp = new Employee(3);
		
		System.out.print("emp�� ���������� �����ϴ� ��ȣ : " );
		System.out.println(emp.eno);
		//�̴�� ������ JVM�� ����Ǳ� ������ �Ҹ��ڰ� ������� �ʰ�
		//���α׷��� ��������ν� �޸𸮰� �����ȴ�.
		
		//���� gc�� ������ �ٿ� ����ϱ⺸�ٴ� ���α׷� ���� ���� �����ϰ� �ɸ�
		//�� �Ҷ� �ɾ��־� �޸𸮸� ������ �� �̿�
		System.gc();
	}

}
