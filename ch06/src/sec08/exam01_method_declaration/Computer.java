package sec08.exam01_method_declaration;

public class Computer {
	//파라미터의 값이 얼마나 들어올지 정하지 않은 경우
	
	// 배열형
	public int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	//...형
	//...은 배열과 똑같이 사용됨
	public int sum2(int ... values) {
		int sum = 0;
		for(int i=0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
