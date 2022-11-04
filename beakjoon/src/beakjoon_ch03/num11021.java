package beakjoon_ch03;

import java.util.Scanner;

public class num11021 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sel = scan.nextInt();
		int[] sum = new int[sel];
		
		for(int i = 0; i < sel; i++) {
			int fir = scan.nextInt();
			int sec = scan.nextInt();
			sum[i] = fir + sec;
		}
		
		for(int j = 0; j < sel; j++) {
			System.out.println("Case #"+ (j+1) + ": " + sum[j]);
		}
		
	}

}
