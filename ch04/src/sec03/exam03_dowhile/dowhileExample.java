package sec03.exam03_dowhile;
import java.util.Scanner; //ctrl + shift + o 하면 바로 스캐너 호출

public class dowhileExample {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		int i = 0;
		Scanner scan = new Scanner(System.in);
		String inputValue;
		
		do {
			System.out.print(">");
			inputValue = scan.nextLine();
			System.out.println(inputValue);
		} while(!inputValue.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
		
	}

}
