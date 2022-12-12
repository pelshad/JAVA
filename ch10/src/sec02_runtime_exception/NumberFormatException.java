package sec02_runtime_exception;

public class NumberFormatException {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		//integer.parseInt(문자열);
		//문자열을 int로 변환
		//"100" -> 100
		int value1 = Integer.parseInt(data1);
		//"a100" -> NumberFormatExeption
		int value2 = Integer.parseInt(data1);
	}

}
