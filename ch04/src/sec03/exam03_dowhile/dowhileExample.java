package sec03.exam03_dowhile;
import java.util.Scanner; //ctrl + shift + o �ϸ� �ٷ� ��ĳ�� ȣ��

public class dowhileExample {

	public static void main(String[] args) {
		System.out.println("�޽����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���");
		
		int i = 0;
		Scanner scan = new Scanner(System.in);
		String inputValue;
		
		do {
			System.out.print(">");
			inputValue = scan.nextLine();
			System.out.println(inputValue);
		} while(!inputValue.equals("q"));
		
		System.out.println();
		System.out.println("���α׷� ����");
		
	}

}
