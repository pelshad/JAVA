package sec12.exam01_package_compile;

public class Application {

	public static void main(String[] args) {
		System.out.println("run application");
		
		//��Ŭ������ ���
		//����� bin������ class���Ϸ� �����ϵ�
		//Ȯ�ι��
		//window -> showview -> Navigator
		
		//cmd���� ������ �� �����
		//java������ c:\temp������ �̵�
		//�ش� ������ �̵��� javac Application.java(���ϸ�)
		//�׷� ������ �Ϸ� �� class ���� ����
		//������ package ��ΰ� ��� ������ ���� ����
		//�ش� ��Ű���� sec12.exam01_package_compile
		//temp ���� �ȿ� sec12\exam01_package_compile ���� ����
		//�ش� class������ �̵�
		//cmd���� �ش� ������ �̵��ؼ� ����� ����(package ��� ����)
		//package ��ΰ� ���� �� �ֵ��� �ֻ��� package������ �ִ� ������ �̵�(������ ��� temp����)
		//temp�������� java sec12.exam01_package_compile.Application
		//���� �Ϸ�
		//�� �����ϰ� ������(package ��α��� ���� ���Խ��� ������)
		//cmd���� javac -d . Application.java
		//��Ű�� ��α��� �� �ϼ��Ǿ� ������ ��
	}

}
