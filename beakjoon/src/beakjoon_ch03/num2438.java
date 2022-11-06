package beakjoon_ch03;

import java.util.Scanner;

public class num2438 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int selStar = scan.nextInt();
		for(int i = 0; i<selStar; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
