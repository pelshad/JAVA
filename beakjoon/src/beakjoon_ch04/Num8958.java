package beakjoon_ch04;

import java.util.Scanner;

public class Num8958 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int No = sc.nextInt();
		String[] OX = new String[No];

		for(int i = 0; i<OX.length; i++) {
			OX[i] = sc.next();
		}
		
		for(int i = 0; i<OX.length; i++) {
			int count = 1;
			int sum = 0;
			String[] arr = OX[i].split("");
			for(int j = 0; j<arr.length; j++) {
				if(arr[j].equals("O")) {
					sum += count;
					count++;
				} else {
					count = 1;
				}
			}
			System.out.println(sum);
		}
	}
}