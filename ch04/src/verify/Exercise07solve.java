package verify;
import java.util.Scanner;

public class Exercise07solve {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1.����|2.���|3.�ܰ�|4.����");
			System.out.println("-----------------------");
			System.out.print("����> ");
			
			int menuNum = scan.nextInt();
			
			switch(menuNum) {
			case 1:
				System.out.print("���ݾ� > ");
				balance += scan.nextInt();
				break;
			case 2:
				System.out.print("��ݾ� > ");
				balance -= scan.nextInt();
				break;
			case 3:
				System.out.println("�ܰ� > " + balance);
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�.");
				run = false;
				break;
			default:
				System.out.println("1~4�� ���ڸ� �Է����ּ���");
				break;
			}
		}
		
	}

}
