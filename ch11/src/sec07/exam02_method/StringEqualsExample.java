package sec07.exam02_method;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = new String("ȫ�浿");
		String strVar2 = "ȫ�浿";
		String strVar3 = "ȫ�浿";
		
		//new�� ������ ���ڿ� ��ü�� ���� �ٸ� �ּҰ��� ����
		if(strVar1 == strVar2) {
			System.out.println("���� String ��ü�� ����");
		} else {
			System.out.println("�ٸ� String ��ü�� ����");
		}
		//���������� ������� ���ڿ� ��ü�� ���� �ּҰ��� ����
		if(strVar2 == strVar3) {
			System.out.println("���� String ��ü�� ����");
		} else {
			System.out.println("�ٸ� String ��ü�� ����");
		}
		
		//equals�� object�� ���� �޼ҵ�� �ּҰ��� �����Ͽ� true/false�� �����ϳ�
		//StringŸ�Կ��� override�Ǿ� ���ڿ� ��ü�� ���Ͽ� true/false�� �����Ѵ�.
		if(strVar1.equals(strVar2)) {
			System.out.println("���� ���ڿ���");
		} else {
			System.out.println("�ٸ� ���ڿ���");
		}
		
		if(strVar2.equals(strVar3)) {
			System.out.println("���� ���ڿ���");
		} else {
			System.out.println("�ٸ� ���ڿ���");
		}
		
	}

}
