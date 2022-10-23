package sec06.exam01_array_bylist;

public class arrayCreateByValueListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {83, 90, 87};  //scores는 스택에 생성, 각 값은 힙에 생성
		
		System.out.println("socres[0] : " + scores[0]);
		System.out.println("socres[1] : " + scores[1]);
		System.out.println("socres[2] : " + scores[2]);
		
		int sum = 0;
		
		for(int i=0;i<scores.length;i++) {
			sum += scores[i];
		}
		System.out.println(sum);
		
		double avg = (double) sum / scores.length;
		System.out.println(avg);
	}

}
