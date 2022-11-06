package beakjoon_ch03;

import java.util.Scanner;

public class num1110 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); // 26이라면?
		int result = 0;
		int count = 1;
		
		if(num < 10) {
			num *= 10;
		}
		
		// num값으로 계속 선언되면 비교를 못해서 최초에 한번은 while밖에서 실행
		// 더 효율적인 방법이 있긴 할거 같은데...
		
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
