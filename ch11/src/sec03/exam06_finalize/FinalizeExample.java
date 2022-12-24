package sec03.exam06_finalize;

public class FinalizeExample {

	public static void main(String[] args) {
		Counter counter = null;
		for(int i=0; i<=50; i++) {
			counter = new Counter(i);
			//만들자마자 쓰레기 객체화(GC발생)
			counter = null;
			//GC 발생 요청
			System.gc();
			//순차적으로 모든 객체가 GC처리되지 않는걸 확인할 수 있다
		}

	}

}
