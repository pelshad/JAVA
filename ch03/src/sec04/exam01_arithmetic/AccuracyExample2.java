package sec04.exam01_arithmetic;

public class AccuracyExample2 {

	public static void main(String[] args) {
		int apple = 1;
		int totalPieces = apple * 10;
		int number = 7;
		int temp = totalPieces - number;
		
		double result = temp/10.0;
		System.out.println("��� 1������ " + (double) number/10 + "������ ����" + result + "������ ���´�");
		
	}

}