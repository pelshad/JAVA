package sec06.exam01_array_bylist;

public class arrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87};
		int sum1 = 0;
		for(int i = 0; i < scores.length; i++) {
			sum1 += scores[i];
		}
		System.out.println(sum1);
		
		int result = add(new int[] {64,23,53,75,45,67,75});
		System.out.println(result);
		
		System.out.println(add(scores));
	}
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
