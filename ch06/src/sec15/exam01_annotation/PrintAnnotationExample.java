package sec15.exam01_annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		//����� �޼ҵ带 �迭�� ����
		//Method[] ����� �̿��ϱ� ���ؼ� import �ʿ�
		
		for(Method method : declaredMethods) {
			//PrintAnnotation ������̼��� ����� �޼ҵ����� üũ
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				//getName() �޼ҵ��� �̸��� ���
				System.out.println(method.getName() + "������̼� �����");
			} else {
				System.out.println(method.getName() + "������̼� ������� ����");
			}
		}
		System.out.println();
		for(Method method : declaredMethods) {
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				//annotation�� ���� ��� ���� annotation ��ü ����
				PrintAnnotation printAnnotation 
				= method.getAnnotation(PrintAnnotation.class);
				
				//�޼ҵ� �̸� ���
				System.out.println("[" + method.getName() + "]");
				
				//value�� number��ŭ ���
				for(int i = 0; i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				try {
					//invoke�޼ҵ� ȣ��
					method.invoke(new Service());
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				System.out.println();
				
				
			}
		}
	}
}
