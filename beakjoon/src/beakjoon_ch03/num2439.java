package beakjoon_ch03;

import java.util.Scanner;

public class num2439 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int selStar = scan.nextInt();
		
		for(int i = 1; i <= selStar; i++) {
			for(int z = 0; z < selStar-i; z++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
