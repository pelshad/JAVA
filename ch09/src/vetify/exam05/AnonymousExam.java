package vetify.exam05;

public class AnonymousExam {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		//�͸� ��ü �ʵ� ���
		anony.filed.run();
		//�͸� ��ü ���ú��� ���
		anony.method1();
		//�͸� ��ü �Ű��� ���
		anony.method2(new Vehicle() {

			@Override
			public void run() {
				System.out.println("Ʈ���� �޸��ϴ�.");
			}
		});
	}
}
