package verify;

public class Exercise04 {
	public static void main(String[] args) {
		//주사위 2개를 굴려서 눈의 합이 5가 될때까지 반복되는 while문 작성
		
		while(true) {
			int first = (int)(Math.random()*6) + 1;
			int second = (int)(Math.random()*6) + 1;
			System.out.println("(" + first +", "+ second+")");
			if(first+second == 5) {
				break;
			}
		}
	}
}
