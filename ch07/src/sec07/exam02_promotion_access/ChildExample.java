package sec07.exam02_promotion_access;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child;
		
		//�θ��� �޼ҵ� ȣ��
		parent.method1();
		//�������̵� �� �ڽ��� �޼ҵ尡 ȣ���
		parent.method2();
		//�θ�Ŭ������ ������ �ν��Ͻ��̱� ������ child�� method3�� ȣ�� �ȵ�
		//parent.method3();
	}
	
}
