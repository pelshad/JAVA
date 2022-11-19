package sec07.exam01_promotion;

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//최상위 부모인 A는 모든 변수 대입 가능
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		//D의 부모인 B는 d를 대입가능, E의 부모인 C는 e를 대입가능
		B b1 = d;
		C c1 = e;
		
		//직접적인 부모관계가 없는 값은 대입 불가능
		//B b2 = e;
		//C c2 = d;
		
	}
}
