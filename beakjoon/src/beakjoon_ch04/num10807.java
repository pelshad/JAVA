package beakjoon_ch04;

import java.util.Scanner;

public class num10807 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr;
		int start = scan.nextInt();
		arr = new int[start];
		int count = 0;
		
		for(int i = 0; i<arr.length;i++) {
			int a = scan.nextInt();
			arr[i] = a;
		}
		
		int findNum = scan.nextInt();
		for(int i = 0; i<arr.length; i++) {
			if(findNum == arr[i]) {
				count++;
			}
		}
		System.out.println(count);
	}
}
