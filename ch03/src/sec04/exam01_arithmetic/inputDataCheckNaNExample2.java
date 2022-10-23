package sec04.exam01_arithmetic;

public class inputDataCheckNaNExample2 {

	public static void main(String[] args) {
		String userInput = "NaN";
		double currentBalance = 10000.0;
		
		try{
			double val = Double.valueOf(userInput);
			if(Double.isNaN(val)) {
				System.out.println("NaN이 입력되어 처리할 수 없음");
			} else {
				//currentBalance = currentBalance + val;
				currentBalance += val;
				System.out.println(currentBalance);
			}
			}
		catch(NumberFormatException e) {
			System.out.println("숫자를 입력하여 주세요");
		}
		
		
		
		
		
		
			
			
					
	}

}
