package sec07.exam02_default_method_extends;

public class DefaultMethodExtendsExample {
	//�θ� default �޼ҵ带 �ڽ� �������̽��� Ȱ���ϴ� ���
	//1. ��ӹ��� �״�� ���
	//2. override�Ͽ� ���
	//3. �߻�ȭ�Ͽ� ���

	public static void main(String[] args) {
		//�θ��� default �޼ҵ带 �������� ����
		ChildInterface1 ci1 = new ChildInterface1() {
			@Override
			public void method1() {
				System.out.println("�θ� �߻� method1() ����");
			}

			@Override
			public void method3() {
				System.out.println("�ڽ� �߻� method3() ����");
			}
		};
		ci1.method1();
		ci1.method2();
		ci1.method3();
		System.out.println();
		
		//�θ��� default �޼ҵ带 override
		ChildInterface2 ci2 = new ChildInterface2() {
			@Override
			public void method1() {
				System.out.println("�θ� �߻� method1() ����");
			}

			@Override
			public void method3() {
				System.out.println("�ڽ� �߻� method3() ����");
			}
		};
		ci2.method1();
		ci2.method2();
		ci2.method3();
		System.out.println();
		
		//�θ��� default �޼ҵ带 ���߻�ȭ
		ChildInterface3 ci3 = new ChildInterface3() {
			@Override
			public void method1() {
				System.out.println("�θ� �߻� method1() ����");
			}
			
			//�ڽ� �������̽����� �߻�ȭ �Ͽ��� ������ ������ �ݵ�� ������ �ʿ�
			@Override
			public void method2() {
				System.out.println("�θ� default �޼ҵ带 �߻�ȭ�� �� �籸�� �޼ҵ�");
			}

			@Override
			public void method3() {
				System.out.println("�ڽ� �߻� method3() ����");
			}
		};
		ci3.method1();
		ci3.method2();
		ci3.method3();

	}
	

}
