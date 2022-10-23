package verify;
import java.util.Scanner;

public class Exercise07my {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputNum;
		int totalmoney = 0;
		
		while(true) {
			System.out.println("-----------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("-----------------------");
			System.out.print("선택> ");
			inputNum = scan.nextInt();
			
			if(inputNum == 1) {
				inputNum = 0;
				System.out.print("예금액> ");
				inputNum = scan.nextInt();
				totalmoney += inputNum;
			}
			
			if(inputNum == 2) {
				inputNum = 0;
				System.out.print("출금액> ");
				inputNum = scan.nextInt();
				totalmoney -= inputNum;
			}
			
			if(inputNum == 3) {
				inputNum = 0;
				System.out.println("잔고> " + totalmoney);
			}
			
			if(inputNum == 4) {
				System.out.println("프로그램 종료");
				break;
			}
			
			
		}
		
	}

}
