package sec02_runtime_exception;

public class NumberFormatException {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		//integer.parseInt(���ڿ�);
		//���ڿ��� int�� ��ȯ
		//"100" -> 100
		int value1 = Integer.parseInt(data1);
		//"a100" -> NumberFormatExeption
		int value2 = Integer.parseInt(data1);
	}

}
