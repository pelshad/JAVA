package sec08.exam03_method_call;

public class Calculator {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y); //plus ȣ��
		double result = sum/2;
		return result;  
	}
	
	void execute() {
		double result = avg(7, 10); // avg ȣ��
		//��� execute�޼ҵ�� avg�� ȣ���ϰ� avg�� plus�� ȣ���Ѵ�.
		println("������ : " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}