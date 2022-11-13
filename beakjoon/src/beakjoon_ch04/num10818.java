package beakjoon_ch04;

import java.util.Scanner;

public class num10818 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr;
		int arrLen = scan.nextInt();
		arr = new int[arrLen];
		int minNum;
		int maxNum;
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		minNum = arr[0];
		maxNum = arr[0];
		for(int i = 0; i<arr.length; i++) {
			maxNum = (maxNum > arr[i]) ? maxNum : arr[i];
			minNum = (minNum < arr[i]) ? minNum : arr[i];
		}
		
		System.out.println(minNum + " " + maxNum);

	}

}
