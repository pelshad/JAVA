package verify;
import java.util.Scanner;

public class Exercise07solve {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("-----------------------");
			System.out.print("선택> ");
			
			int menuNum = scan.nextInt();
			
			switch(menuNum) {
			case 1:
				System.out.print("예금액 > ");
				balance += scan.nextInt();
				break;
			case 2:
				System.out.print("출금액 > ");
				balance -= scan.nextInt();
				break;
			case 3:
				System.out.println("잔고 > " + balance);
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("1~4의 숫자를 입력해주세요");
				break;
			}
		}
		
	}

}
