package sec04.exam01_arithmetic;

public class inputDataCheckNaNExample2 {

	public static void main(String[] args) {
		String userInput = "NaN";
		double currentBalance = 10000.0;
		
		try{
			double val = Double.valueOf(userInput);
			if(Double.isNaN(val)) {
				System.out.println("NaN�� �ԷµǾ� ó���� �� ����");
			} else {
				//currentBalance = currentBalance + val;
				currentBalance += val;
				System.out.println(currentBalance);
			}
			}
		catch(NumberFormatException e) {
			System.out.println("���ڸ� �Է��Ͽ� �ּ���");
		}
		
		
		
		
		
		
			
			
					
	}

}
