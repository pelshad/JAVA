package sec06.exam4_main_argument;

public class mainStringArrayExample {

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("프로그램의 사용법");
			System.out.println("java sec06.exam4_main_argument.mainStringArrayExample num1 num2");
			//run의 드롭다운 메뉴에 run configuration에 argument값을 준다
			System.exit(0); //jvm 종료 코드
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1); // 문자열을 int타입으로 변환
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " +result);
		
	}

}
