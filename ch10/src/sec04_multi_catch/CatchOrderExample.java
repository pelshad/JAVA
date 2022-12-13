package sec04_multi_catch;

public class CatchOrderExample {

	public static void main(String[] args) {
		//다중으로 사용시 유의 사항
		//catch문에서 범위가 넓은 Exception e보다
		//범위가 더 좁은 특정 Exception을 먼저 두어야 해당 예외에 대한
		//catch문이 먼저 발생한다.
		
		incorrectMultiException();
		rightMultiException();
		
	}
	
	public static void incorrectMultiException() {
		try {
			String[] args = {"0", "0"};
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(result);
		} catch(Exception e) {
			System.out.println("모든 예외가 먼저 출력됩니다.");
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없는 예외가 출력됩니다.");
		}
	}
	
	public static void rightMultiException() {
		try {
			String[] args = {"0", "0"};
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(result);
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없는 예외가 먼저 출력됩니다.");
		} catch(Exception e) {
			System.out.println("모든 예외가 출력됩니다.");
		}
	}
	
}
