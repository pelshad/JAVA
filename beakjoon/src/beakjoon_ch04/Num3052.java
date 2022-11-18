package beakjoon_ch04;

import java.util.Scanner;

public class Num3052 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int[] arr2;
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt()%42;
		}
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 1; j<arr.length; j++) {
				if(i != j) {
					if( arr[i] == arr[j] ) {
						arr[j] = 10000;
					}
				}
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] != 10000) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}
}
