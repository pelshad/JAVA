package sec03.exam02_while;
import java.util.Scanner;


public class whileKeyControlExample2 {

	public static void main(String[] args) {
		int sum = 0;
		while(true) {
			
			if(sum < 0) {
				System.out.println("속도가 0미만 입니다 프로그램을 종료합니다.");
				break;
			}
			
			System.out.println("1.증가 | 2. 감소 | 3. 종료");
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();			
			
			if(a==1) {
				sum += 1;
				System.out.println("속도가 증가했습니다. 현재 속도 : " + sum);
			} else if (a==2){
				sum -= 1;
				System.out.println("속도가 감소했습니다. 현재 속도 : " + sum);
			} else { 
				System.out.println("프로그램을 종료 합니다.");
				break;
			}
			
			
		}

	}

}
