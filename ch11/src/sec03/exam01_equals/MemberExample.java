package sec03.exam01_equals;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		//�ּҰ��� ���ϴ� equals
		if(obj1.equals(obj2)) { // (obj1 == obj2)�� ����
			System.out.println("������ ��ü�Դϴ�.");
		} else {
			System.out.println("�������� �ʽ��ϴ�.");
		}

		if(obj1.equals(obj2)) {
			System.out.println("������ ��ü�Դϴ�.");
		} else {
			System.out.println("�������� �ʽ��ϴ�.");
		}
		System.out.println();
		//////////////////////////////////////////////
		//equals()�� �������̵��� Member2��ü
		Member2 obj4 = new Member2("blue");
		Member2 obj5 = new Member2("blue");
		Member2 obj6 = new Member2("red");
		
		//�ּҰ��� ���ϴ� equals
		if(obj4.equals(obj5)) {
			System.out.println("������ ��ü�Դϴ�.");
		} else {
			System.out.println("�������� �ʽ��ϴ�.");
		}

		if(obj4.equals(obj6)) {
			System.out.println("������ ��ü�Դϴ�.");
		} else {
			System.out.println("�������� �ʽ��ϴ�.");
		}
		
	}
}
