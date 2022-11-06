package beakjoon_ch03;

import java.util.Scanner;

public class num10951 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//hasNextInt : 결과값이 인트 일 경우 true 리턴
		//백준 문제에서 안걸어두면 런타임 에러뜸
		//그걸 좀 미리 말해주지 너무 하네 이거
		while(scan.hasNextInt()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int sum = a + b;
			System.out.println(sum);
		}
	}
}
