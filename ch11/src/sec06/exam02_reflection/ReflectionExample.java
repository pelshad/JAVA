package sec06.exam02_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
	//main메소드에 예외떠넘기기를 할 시 JVM에게 예외처리를 요청(실무에선 사용X)
	public static void main(String args[]) throws Exception {
		Class clazz = Class.forName("sec06.exam02_reflection.Car");
		
		System.out.println("[클래스 이름]");
		System.out.println(clazz.getName());
		System.out.println();
		
		System.out.println("[생성자 이름]");
		//생성자를 배열로 생성
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			System.out.print(constructor.getName() +"(");
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		System.out.println();
		
		System.out.println("[필드 이름]");
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}
		
		System.out.println();
		
		System.out.println("[메소드 이름]");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
		}
	}
	
	private static void printParameters(Class[] parameters) {
		for(int i = 0; i<parameters.length;i++) {
			System.out.print(parameters[i].getName());
			if(i<(parameters.length-1)) {
				System.out.print(",");}
		}
	}
	
}
