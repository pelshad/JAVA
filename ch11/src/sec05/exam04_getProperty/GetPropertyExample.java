package sec05.exam04_getProperty;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		//�ü�� �̸�
		String osName = System.getProperty("os.name");
		System.out.println(osName);
		
		//����� �̸�
		String userName = System.getProperty("user.name");
		System.out.println(userName);
		
		//����� Ȩ ���丮
		String userHome = System.getProperty("user.home");
		System.out.println(userHome);
		
		//������Ƽ �÷��� ȣ��
		System.out.println("-----------------------");
		System.out.println(" [key] value");
		System.out.println("-----------------------");
		Properties props = System.getProperties();
		//Ű�� ���� ����
		Set keys = props.keySet();
		for(Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println("[" + key + "] " + value);
		}
	}

}
