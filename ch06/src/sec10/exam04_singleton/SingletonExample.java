package sec10.exam04_singleton;

public class SingletonExample {

	public static void main(String[] args) {
		//Singleton obj1 = new Singleton()
		//Singleton obj2 = new Singleton()
		//외부에서 접근 하지 못하도록 생성자를 private로 막아서 생성 안됨
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}

	}
}