package sec04.exam07_conditional;

public class conditionalOperation {

	public static void main(String[] args) {
		int score = 85;
		
		char grade = (score > 90) ? 'A' : ((score>80) ? 'B' : 'C');
		System.out.println(grade);

	}

}
