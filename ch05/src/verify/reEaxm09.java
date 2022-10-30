package verify;
import java.util.Scanner;

public class reEaxm09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int selNum;
		int stuNum = 0;
		int[] exam = null;
		int inExam;
		int sumNum = 0;
		double avgNum = 0.0;
		int count = 0;
		
		while(true) {
			System.out.println("-------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택>");
			selNum = scan.nextInt();
			
			if(selNum == 1) {
				System.out.print("학생수 > ");
				stuNum = scan.nextInt();
				selNum = 0;
				exam = new int[stuNum];
			}
			
			if(selNum == 2) {
				for(int i = 0; i<exam.length ; i++) {
					inExam = scan.nextInt();
					exam[i] = inExam;
				}
			}
			
			if(selNum == 3) {
				for(int i = 0; i<exam.length; i++) {
					System.out.println(exam[i]);
				}
			}
			
			if(selNum == 4) {
				for(int i =0; i<exam.length; i++) {
					sumNum += exam[i];
					count++;
				}
				System.out.println("최고 점수 : " + sumNum);
				avgNum = (double)sumNum/count;
				System.out.println("평균 점수 : " + avgNum);
			}
			
			if(selNum == 5) {
				break;
			}
		
		}
		

	}

}
