package verify;

import java.util.Scanner;

public class Exercise09My {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] scores = null;
		int studentNum = 0;
		int maxScore = 0;
		int cntSc = 0;
		int sumScores = 0;
		
		
		while(true) {
			System.out.println("-------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택>");
			
			int selNum = scan.nextInt();
			
			if(selNum == 1) {
				System.out.print("학생수 > ");
				studentNum = scan.nextInt();
				scores = new int[studentNum];
			} else if(selNum == 2) {
				for(int i = 0; i<scores.length; i++) {
					System.out.print("socres["+ i +"]>");
					scores[i] = scan.nextInt();
				}
			} else if(selNum == 3) {
				for(int i = 0; i<scores.length; i++) {
					System.out.println("socres["+ i +"] : " + scores[i]);
				}
			} else if(selNum == 4) {
				for(int i = 0; i<scores.length; i++) {
					sumScores += scores[i];
					if(maxScore < scores[i]) {
						maxScore = scores[i];
						cntSc++;
					}
				
				}
				System.out.println("최고점수 : " + maxScore);
				System.out.println("평균 : " + (double)sumScores/cntSc );
			} else if(selNum == 5) {
				break;
			}
			
			
			
			
		}
		
		
	}

}
