package sec06.exam4_main_argument;

public class mainStringArrayExample {

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("���α׷��� ����");
			System.out.println("java sec06.exam4_main_argument.mainStringArrayExample num1 num2");
			//run�� ��Ӵٿ� �޴��� run configuration�� argument���� �ش�
			System.exit(0); //jvm ���� �ڵ�
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1); // ���ڿ��� intŸ������ ��ȯ
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " +result);
		
	}

}
