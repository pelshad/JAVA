package verify;
import java.util.Scanner;

public class Exercise07my {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputNum;
		int totalmoney = 0;
		
		while(true) {
			System.out.println("-----------------------");
			System.out.println("1.����|2.���|3.�ܰ�|4.����");
			System.out.println("-----------------------");
			System.out.print("����> ");
			inputNum = scan.nextInt();
			
			if(inputNum == 1) {
				inputNum = 0;
				System.out.print("���ݾ�> ");
				inputNum = scan.nextInt();
				totalmoney += inputNum;
			}
			
			if(inputNum == 2) {
				inputNum = 0;
				System.out.print("��ݾ�> ");
				inputNum = scan.nextInt();
				totalmoney -= inputNum;
			}
			
			if(inputNum == 3) {
				inputNum = 0;
				System.out.println("�ܰ�> " + totalmoney);
			}
			
			if(inputNum == 4) {
				System.out.println("���α׷� ����");
				break;
			}
			
			
		}
		
	}

}
