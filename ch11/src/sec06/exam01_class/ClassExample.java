package sec06.exam01_class;

public class ClassExample {

	public static void main(String[] args) {
		Car car = new Car();
		//car�� Ŭ���� ��ü ȹ��
		Class clazz1 = car.getClass();
		
		//car�� ��Ű��, Ŭ������
		System.out.println(clazz1.getName());
		//������ Ŭ������
		System.out.println(clazz1.getSimpleName());
		//��Ű�� ��
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		
		//���ڿ��� ȹ��(try catch�ʿ�)
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
