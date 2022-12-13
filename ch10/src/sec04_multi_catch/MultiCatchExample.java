package sec04_multi_catch;

public class MultiCatchExample {

	public static void main(String[] args) {
		//동시 try catch문
		//특정 예외들만 따로 예외처리하고 싶은 경우 사용
		
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(result);
		} catch(ArrayIndexOutOfBoundsException | NumberFormatException  e) {
			System.out.println("실행 매개값의 수가 부족하거나 숫자로 변환할 수 없습니다.");
		} catch(Exception e) {
			System.out.println("모든 예외가 출력됩니다.");
		}
		
	}
}
