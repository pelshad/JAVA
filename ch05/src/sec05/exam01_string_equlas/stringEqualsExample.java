package sec05.exam01_string_equlas;

public class stringEqualsExample {

	public static void main(String[] args) {
		//
		String strVar1 = "ȫ�浿";
		String strVar2 = "ȫ�浿";
		
		if(strVar1 == strVar2) {
			System.out.println("���� �ּҸ� ����");
		} else {
			System.out.println("���� �ּҸ� �������� ����");
		}
		
		//new�� ������ ��ü�� �ٸ� �ּ�(heap���� )�� ����
		String strVar3 = new String("ȫ�浿");
		String strVar4 = new String("ȫ�浿");
		
		if(strVar3 == strVar4) {
			System.out.println("���� �ּҸ� ����");
		} else {
			System.out.println("���� �ּҸ� �������� ����");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("���� ���ڿ��� ������ ����");
		}

	}

}
