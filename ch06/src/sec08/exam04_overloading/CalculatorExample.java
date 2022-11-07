package sec08.exam04_overloading;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		double result = calc.areaRectangle(10);
		double result2 = calc.areaRectangle(10, 20);
		System.out.println("정사각형의 넓이 : " + result);
		System.out.println("직사각형의 넓이 : " + result2);

	}

}
