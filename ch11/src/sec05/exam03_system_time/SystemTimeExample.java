package sec05.exam03_system_time;

public class SystemTimeExample {
	public static void main(String[] args) {
		//���۰�
		long time1 = System.nanoTime();
		
		int sum = 0;
		for(int i=1; i<10000000; i++) {
			sum += i;
		}
		
		//���ᰪ
		long time2 = System.nanoTime();
		//������ �ð��� ���
		System.out.println(time2 - time1);
	}
}
