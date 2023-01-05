package sec05.exam03_system_time;

public class SystemTimeExample {
	public static void main(String[] args) {
		//시작값
		long time1 = System.nanoTime();
		
		int sum = 0;
		for(int i=1; i<10000000; i++) {
			sum += i;
		}
		
		//종료값
		long time2 = System.nanoTime();
		//측정된 시간을 출력
		System.out.println(time2 - time1);
	}
}
