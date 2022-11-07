package sec08.exam03_method_call;

public class Calculator {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y); //plus 호출
		double result = sum/2;
		return result;  
	}
	
	void execute() {
		double result = avg(7, 10); // avg 호출
		//결론 execute메소드는 avg를 호출하고 avg는 plus를 호출한다.
		println("실행결과 : " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
