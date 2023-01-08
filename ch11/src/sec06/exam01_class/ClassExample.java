package sec06.exam01_class;

public class ClassExample {

	public static void main(String[] args) {
		Car car = new Car();
		//car의 클래스 객체 획득
		Class clazz1 = car.getClass();
		
		//car의 패키지, 클래스명
		System.out.println(clazz1.getName());
		//순수한 클래스명
		System.out.println(clazz1.getSimpleName());
		//패키지 명
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		
		//문자열로 획득(try catch필요)
		try {
			Class clazz2 = Class.forName("sec06.exam01_class.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
			System.out.println();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
