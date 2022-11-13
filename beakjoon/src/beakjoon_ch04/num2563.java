package beakjoon_ch04;

import java.util.Scanner;

public class num2563 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr;
		arr = new int[9];
		
		for(int i = 0; i<9; i++) {
			arr[i] = scan.nextInt();
		}
		
		int maxNum = arr[0];
		int maxIdx = 1;
		for(int i = 0; i<arr.length; i++) {
			if(maxNum > arr[i]) {
				maxNum = maxNum;
			} else {
				maxNum = arr[i];
				maxIdx = i+1;
			}
		}
		System.out.println(maxNum);
		System.out.println(maxIdx);
	}
}
