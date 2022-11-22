package sec07.exam07_instanceof;

public class InstanceofExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			//instanceof
			//parent ��ü�� Child Ÿ������ ����������� üũ�ϴ� �Լ�
			
			
			//�̷��Ը� �ۼ��صθ� ���� child Ÿ���� ��ü�� ���� ������
			//ClassCastException �߻�
			Child child = (Child) parent;
			System.out.println("method1 - Child�� ��ȯ ����");
		} else {
			System.out.println("method1 - Child�� ��ȯ���� ����");
		}
		
	}
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child�� ��ȯ ����");
	}
	public static void main(String[] args) {
		Parent parentA = new Child();
		Parent parentB = new Parent();
		
		method1(parentA);//��ȯ��
		method1(parentB);//��ȯ�ȵ�
		method2(parentA);//��ȯ��
		//method2(parentA); //ClassCastException
	}
}
