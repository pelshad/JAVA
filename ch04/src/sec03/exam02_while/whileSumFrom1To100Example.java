package sec03.exam02_while;

public class whileSumFrom1To100Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
