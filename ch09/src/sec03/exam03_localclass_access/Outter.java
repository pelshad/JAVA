package sec03.exam03_localclass_access;

public class Outter {
	//�ڹ�7 ����
	public void method1(final int arg) {
		final int localVariable = 1;
		//�ڹ�7 �������� �Ű������� ���������� final�� ������ ������ ����
		//���� ���� ���� �� �� ����.
		//arg = 10;
		//localVariable = 10;
		class Inner{
			void method() {
				//�����Ϸ����� �� �Ű������� ���������� �޼ҵ� �ȿ� �����Ͽ� ����Ѵ�.
				//int arg = 10;
				//int localVariable = 10;
				int reseult = arg + localVariable;
			}
		}
		//�̷��� ���Ǵ� ����
		//method1�� ���ᰡ �Ǹ� �Ű������� ���ú����� stack���� ������� �Ǿ�
		//Inner Ŭ�������� �� ���� �̿����� ���ϰ� �ȴ�.
		//������ Inner Ŭ������ heap�� ���� ���� �Ǿ�� �ϱ⿡ final�� ����
		//�� ���� �����Ͽ� ���(final�� ���� ������ ���縦 ���� ����)
	}
	
	//�ڹ�8 ����
	public void method2(int arg) {
		int localVariable = 1;
		int localVariable2 = 10;
		
		//�ڹ� 8 ���� final�� ������ �ʾƵ� ������ ������ ������ ����
		//������ �� �Ű������� ���ú����� final �Ӽ��� �ڵ����� ������ �ȴ�.
		//�׷��� ������ ���� ���� �� �� ����.
		
		//arg = 10;
		//localVariable = 10;
		
		//���� Ŭ�������� ������ ���� localVariable2 ������ final �Ӽ���
		//������ �ʴ´�.
		localVariable2 = 20;
		
		class Inner{
			//�����Ϸ����� �� �Ű������� ���������� Ŭ���� �ȿ� �����Ͽ� ����Ѵ�.
			//int arg = 10;
			//int localVariable = 10;
			void method() {
				int reseult = arg + localVariable;
			}
		}
	}
}
