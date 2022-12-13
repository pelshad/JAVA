package sec04_multi_catch;

public class CatchByExceptionKindExample {

	public static void main(String[] args) {
		//다중 try catch문
		//예외가 동시에 발생시 맨 처음 catch문만 실행
		
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(result);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}
		

	}

}
