package beakjoon_ch03;
import java.util.Scanner;

public class num25304 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int maxNum = sc.nextInt();
		int selGoods = sc.nextInt();
		int sumNum = 0;
		
		for(int i = 0; i < selGoods; i++) {
			int selGood = sc.nextInt();
			int multi = sc.nextInt();
			sumNum += (selGood*multi);
			}
		
		if(maxNum == sumNum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
}
