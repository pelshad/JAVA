package beakjoon_ch03;

import java.util.Scanner;

public class num1110 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); // 26�̶��?
		int result = 0;
		int count = 1;
		
		if(num < 10) {
			num *= 10;
		}
		
		// num������ ��� ����Ǹ� �񱳸� ���ؼ� ���ʿ� �ѹ��� while�ۿ��� ����
		// �� ȿ������ ����� �ֱ� �Ұ� ������...
		
		int fir = num/10; // 2
		int sec = num%10; // 6
		result = fir+sec;  // 8
		result = (sec*10) + result%10; //68
		
		while(num != result) {
			fir = result/10;  // 6
			sec = result%10;  // 8
			result = fir+sec;  // 14
			result = (sec*10) + result%10; // 84
			count++;
		}
		System.out.println(count);
	}
}
