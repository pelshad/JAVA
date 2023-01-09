package sec06.exam02_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionExample {
	
	public static void main(String args[]) throws Exception {
		//try catch를 해야되나 main메소드에 예외떠넘기기(실무에선 사용 ㄴㄴ)
		Class clazz = Class.forName("sec06.exam02_reflection.Car");
		
		System.out.println("[클래스 이름]");
		System.out.println(clazz.getName());
		System.out.println();
		
		System.out.println("[생성자 정보]");
		//생성자 정보를 배열 형태로 가져옴
		//import java.lang.reflect.Constructor 필요
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] paramters = constructor.getParameterTypes();
			printParamters(paramters);
			System.out.println(")");
		}
		System.out.println();
		
		System.out.println("[필드 정보]");
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			//getSimpleName() 클래스의 패키지명을 제외하고 이름만 받아오는 메소드
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}
		System.out.println();
		
		System.out.println("[메소드 정보]");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			System.out.print(method.getReturnType().getSimpleName() + " ");
			System.out.print(method.getName() + "(");
			Class[] paramters = method.getParameterTypes();
			printParamters(paramters);
			System.out.println(")");
		}
		
		
	}
	
	private static void printParamters(Class[] parameters) {
		//매개변수의 클래스 객체를 배열로 리턴
		
		for(int i=0; i<parameters.length;i++) {
			System.out.print(parameters[i].getName());
			if(i<(parameters.length-1)) System.out.print(",");
		}
	}
	
}
