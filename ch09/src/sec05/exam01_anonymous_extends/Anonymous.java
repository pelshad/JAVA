package sec05.exam01_anonymous_extends;

public class Anonymous{
	//Person Ŭ������ �ν��Ͻ� ����
	Person Field1 = new Person();
	
	//Person Ŭ������ �͸� �ڽ� ��ü ����
	//�θ�ü ������ = new �θ�ü() { };
	Person Field2 = new Person() {
		// wake�̿��� ���� �͸� �ڽ� ��ü�� �ʵ�� �޼ҵ��̱⿡
		// �ش� ��Ͽ��� ��� ��� �� �� ����.
		String studentNo;
		int wakeUp = 6;
		void work() {
			System.out.println("����մϴ�.");
		}
		@Override
		void wake() {
			System.out.println(wakeUp + "�ÿ� �Ͼ�ϴ�.");
		}
	};
	
	void method1() {
		//���ú���
		Person localVar = new Person() {
			String studentNo;
			int wakeUp = 7;
			void walk() {
				System.out.println("��å�մϴ�.");
			}
			@Override
			void wake() {
				System.out.println(wakeUp + "�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		};
		localVar.wake();
	}
	//�Ű�����
	void method2(Person person) {
		person.wake();
	}
}
