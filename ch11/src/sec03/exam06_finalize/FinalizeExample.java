package sec03.exam06_finalize;

public class FinalizeExample {

	public static void main(String[] args) {
		Counter counter = null;
		for(int i=0; i<=50; i++) {
			counter = new Counter(i);
			//�����ڸ��� ������ ��üȭ(GC�߻�)
			counter = null;
			//GC �߻� ��û
			System.gc();
			//���������� ��� ��ü�� GCó������ �ʴ°� Ȯ���� �� �ִ�
		}

	}

}
