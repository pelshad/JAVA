package beakjoon_ch04;

import java.util.Scanner;

public class Num1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double[] exam = new double[num];
		for(int i = 0; i<exam.length; i++) {
			exam[i] = sc.nextDouble();
		}
		double Max = exam[0];
		for(int i=1; i<exam.length; i++) {
			Max = (Max < exam[i]) ? exam[i] : Max;
		}
		double sum = 0;
		for(int i=0; i<exam.length; i++) {
				exam[i] = exam[i]/Max*100;
			sum += exam[i];
		}
		System.out.println(sum/num);
		

	}

}
