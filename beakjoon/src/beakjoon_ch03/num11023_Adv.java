package beakjoon_ch03;

import java.util.Scanner;

public class num11023_Adv {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int[][] resultBox;
		resultBox = new int[t][3];
		
		
		for(int i = 0; i < resultBox.length; i++) {
			int fir = scan.nextInt();
			resultBox[i][0] = fir;
			int sec = scan.nextInt();
			resultBox[i][1] = sec;
			int sum = fir + sec;
			resultBox[i][2] = sum;
		}
		for(int i = 0; i < resultBox.length; i++) {
			System.out.println("Case #"+(i+1)+": " + 
			resultBox[i][0] + " + " + resultBox[i][1] + " = " +
			resultBox[i][2]);
		}
		

	}

}
