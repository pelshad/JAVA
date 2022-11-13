package beakjoon_ch04;

import java.util.Scanner;

public class num10871 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr;
		int selLen = scan.nextInt();
		arr = new int[selLen];
		int selNum = scan.nextInt();
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] < selNum) {
				System.out.print(arr[i] + " ");
			}
		}
		
		
	}
}
