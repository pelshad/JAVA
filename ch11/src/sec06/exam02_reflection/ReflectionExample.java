package sec06.exam02_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionExample {
	
	public static void main(String args[]) throws Exception {
		//try catch�� �ؾߵǳ� main�޼ҵ忡 ���ܶ��ѱ��(�ǹ����� ��� ����)
		Class clazz = Class.forName("sec06.exam02_reflection.Car");
		
		System.out.println("[Ŭ���� �̸�]");
		System.out.println(clazz.getName());
		System.out.println();
		
		System.out.println("[������ ����]");
		//������ ������ �迭 ���·� ������
		//import java.lang.reflect.Constructor �ʿ�
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] paramters = constructor.getParameterTypes();
			printParamters(paramters);
			System.out.println(")");
		}
		System.out.println();
		
		System.out.println("[�ʵ� ����]");
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			//getSimpleName() Ŭ������ ��Ű������ �����ϰ� �̸��� �޾ƿ��� �޼ҵ�
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}
		System.out.println();
		
		System.out.println("[�޼ҵ� ����]");
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
		//�Ű������� Ŭ���� ��ü�� �迭�� ����
		
		for(int i=0; i<parameters.length;i++) {
			System.out.print(parameters[i].getName());
			if(i<(parameters.length-1)) System.out.print(",");
		}
	}
	
}
