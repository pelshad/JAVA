package sec15.exam01_annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		//선언된 메소드를 배열로 담음
		//Method[] 기능을 이용하기 위해서 import 필요
		
		for(Method method : declaredMethods) {
			//PrintAnnotation 어노테이션이 적용된 메소드인지 체크
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				//getName() 메소드의 이름을 출력
				System.out.println(method.getName() + "어노테이션 적용됨");
			} else {
				System.out.println(method.getName() + "어노테이션 적용되지 않음");
			}
		}
		System.out.println();
		for(Method method : declaredMethods) {
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				//annotation의 값을 얻기 위해 annotation 객체 선언
				PrintAnnotation printAnnotation 
				= method.getAnnotation(PrintAnnotation.class);
				
				//메소드 이름 출력
				System.out.println("[" + method.getName() + "]");
				
				//value를 number만큼 출력
				for(int i = 0; i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				try {
					//invoke메소드 호출
					method.invoke(new Service());
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				System.out.println();
				
				
			}
		}
	}
}
