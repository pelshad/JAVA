package sec02_runtime_exception;

public class ArrayIndexOutOfBoundsExceptionExampleResolve {
	public static void main(String[] args) {
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println("args[0] : " + data1);
			System.out.println("args[1] : " + data2);
		} else {
			System.out.println("2���� ���� �־��ּ���");
		}
		
		
		
	}
}
