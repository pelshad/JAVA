package beakjoon_ch03;

import java.util.Scanner;

public class num10952 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			
			int fir = scan.nextInt();
			int sec = scan.nextInt();
			int sum = fir + sec;
			if(fir == 0 && sec == 0) {
				break;
			}
			System.out.println(sum);
		}
	}
}
