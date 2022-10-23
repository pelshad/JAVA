package sec03.exam01_for;

public class forMultiplicationTableExample {
	public static void main(String[] args) {
		for(int m = 2; m <= 9; m++) {
			for(int n = 1; n<=9; n++) {
				int result = m*n;
				System.out.println(m + "x" + n + "=" + result );
			}
			System.out.println("---------------");
		}
	}
}
