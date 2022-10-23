package verify;

public class Exercise03 {
	public static void main(String[] args) {
		//for문을 활용하여 1~100까지 3의 배수의 합
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
