package sec07.exam02_default_method_extends;

public class DefaultMethodExtendsExample {
	//부모 default 메소드를 자식 인터페이스가 활용하는 방법
	//1. 상속받은 그대로 사용
	//2. override하여 사용
	//3. 추상화하여 사용

	public static void main(String[] args) {
		//부모의 default 메소드를 수정없이 받음
		ChildInterface1 ci1 = new ChildInterface1() {
			@Override
			public void method1() {
				System.out.println("부모 추상 method1() 구현");
			}

			@Override
			public void method3() {
				System.out.println("자식 추상 method3() 구현");
			}
		};
		ci1.method1();
		ci1.method2();
		ci1.method3();
		System.out.println();
		
		//부모의 default 메소드를 override
		ChildInterface2 ci2 = new ChildInterface2() {
			@Override
			public void method1() {
				System.out.println("부모 추상 method1() 구현");
			}

			@Override
			public void method3() {
				System.out.println("자식 추상 method3() 구현");
			}
		};
		ci2.method1();
		ci2.method2();
		ci2.method3();
		System.out.println();
		
		//부모의 default 메소드를 재추상화
		ChildInterface3 ci3 = new ChildInterface3() {
			@Override
			public void method1() {
				System.out.println("부모 추상 method1() 구현");
			}
			
			//자식 인터페이스에서 추상화 하였기 때문에 구현시 반드시 재정의 필요
			@Override
			public void method2() {
				System.out.println("부모 default 메소드를 추상화한 뒤 재구현 메소드");
			}

			@Override
			public void method3() {
				System.out.println("자식 추상 method3() 구현");
			}
		};
		ci3.method1();
		ci3.method2();
		ci3.method3();

	}
	

}
