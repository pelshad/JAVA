package sec04.exam05_bit;

public class bitLogicExample {

	public static void main(String[] args) {
		System.out.println("45&25 = " + (45&25));
		System.out.println("45|25 = " + (45|25));
		System.out.println("45^25 = " + (45^25));
		System.out.println("~45 = " + (~45));
		
		System.out.println(toBinaryString(45));
		System.out.println("&");
		System.out.println(toBinaryString(25));
		System.out.println("||");
		System.out.println(toBinaryString(45&25)); //�������� �ܿ� 1�� 1�� ��쿡�� 1����
	}

	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}
}