package sec07.exam01_promotion;

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//�ֻ��� �θ��� A�� ��� ���� ���� ����
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		//D�� �θ��� B�� d�� ���԰���, E�� �θ��� C�� e�� ���԰���
		B b1 = d;
		C c1 = e;
		
		//�������� �θ���谡 ���� ���� ���� �Ұ���
		//B b2 = e;
		//C c2 = d;
		
	}
}
