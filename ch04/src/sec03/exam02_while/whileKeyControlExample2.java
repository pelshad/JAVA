package sec03.exam02_while;
import java.util.Scanner;


public class whileKeyControlExample2 {

	public static void main(String[] args) {
		int sum = 0;
		while(true) {
			
			if(sum < 0) {
				System.out.println("�ӵ��� 0�̸� �Դϴ� ���α׷��� �����մϴ�.");
				break;
			}
			
			System.out.println("1.���� | 2. ���� | 3. ����");
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();			
			
			if(a==1) {
				sum += 1;
				System.out.println("�ӵ��� �����߽��ϴ�. ���� �ӵ� : " + sum);
			} else if (a==2){
				sum -= 1;
				System.out.println("�ӵ��� �����߽��ϴ�. ���� �ӵ� : " + sum);
			} else { 
				System.out.println("���α׷��� ���� �մϴ�.");
				break;
			}
			
			
		}

	}

}
