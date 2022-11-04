package beakjoon_ch03;

import java.util.Scanner;

public class num11022 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int[] firNum = new int[t];
		int[] secNum = new int[t];
		int[] result = new int[t];
		
		for(int i = 0; i < t; i++) {
			int fir = scan.nextInt();
			int sec = scan.nextInt();
			int sum = fir + sec;
			firNum[i] = fir;
			secNum[i] = sec;
			result[i] = sum;
		}
		for(int i = 0; i < t; i++) {
			System.out.println("Case #"+ (i+1) + ": " + firNum[i] +
					 " + " + secNum[i] + " = " + result[i]);
			
		}
		

	}

}
