package sec06.exam01_interface_extends;

public class ImplementationC implements InterfaceC {
	//InterfaceC�� ������ ��ü�̱� ������ C�� �θ��� A,B�� �߻�޼ҵ嵵 ���
	//�����ؾߵȴ�.
	@Override
	public void methodA() {
		System.out.println("methodA ����");
	}

	@Override
	public void methodB() {
		System.out.println("methodB ����");
	}

	@Override
	public void methodC() {
		System.out.println("methodC ����");
	}
	
}
