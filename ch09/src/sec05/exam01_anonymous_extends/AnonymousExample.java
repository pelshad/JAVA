package sec05.exam01_anonymous_extends;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		//Person �ν��Ͻ�
		anony.Field1.wake();
		
		//Person �͸� ��ü
		anony.Field2.wake();
		
		//Person ���� �͸� ��ü ȣ��
		anony.method1();
		
		//�޼ҵ��� �Ű������� �͸� ��ü ���
		anony.method2(new Person() {
			int wakeUp = 8;
			void study() {
				System.out.println("���͵� �մϴ�.");
			}
			@Override
			void wake() {
				System.out.println(wakeUp + "�ÿ� �Ͼ�ϴ�.");
				study();
			}
		});

	}

}
