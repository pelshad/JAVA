package sec04.exam01_arithmetic;

public class inputDataCheckNaNExample {

	public static void main(String[] args) {
		String userInput = "NaN";
		
		double val = Double.valueOf(userInput);
		System.out.println(Double.isNaN(val));
		
		double currentBalance = 10000.0;
		
		currentBalance = currentBalance + val;
		System.out.println(currentBalance);
		
	}

}
