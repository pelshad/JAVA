package sec04.exam03_compare;

public class stringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "ȫ�浿";
		String strVar2 = "ȫ�浿";
		String strVar3 = new String("ȫ�浿");
		
		System.out.println(strVar1 == strVar2); //�����ϴ� ��ġ�� ����
		System.out.println(strVar1 == strVar3); //�����ϴ� ��ġ�� �ٸ�
		System.out.println("------------------");
		System.out.println(strVar1.equals(strVar2)); //���� ��ü�� ��, ����
		System.out.println(strVar1.equals(strVar3)); //���� ��ü�� ��, ����
	}
}
