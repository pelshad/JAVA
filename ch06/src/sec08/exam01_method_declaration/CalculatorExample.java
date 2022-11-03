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
		// 본래 divide 메소드는 파라미터값을 int로 받지만
		// 그 보다 작은 바이트 크기를 가진 byte를 넣어도 자동 타입 변화가 생겨
		// 문제 없음
		System.out.println("divide = " + divide);
	}

}
