package sec08.exam04_overloading;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		double result = calc.areaRectangle(10);
		double result2 = calc.areaRectangle(10, 20);
		System.out.println("���簢���� ���� : " + result);
		System.out.println("���簢���� ���� : " + result2);

	}

}
