package sec08.exam01_method_declaration;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int sum = myCalc.plus(3,5);
		System.out.println("sum = " + sum);
		
		byte x = 10;
		byte y = 4;
		double divide = myCalc.divide(x, y);
		// ���� divide �޼ҵ�� �Ķ���Ͱ��� int�� ������
		// �� ���� ���� ����Ʈ ũ�⸦ ���� byte�� �־ �ڵ� Ÿ�� ��ȭ�� ����
		// ���� ����
		System.out.println("divide = " + divide);
	}

}
