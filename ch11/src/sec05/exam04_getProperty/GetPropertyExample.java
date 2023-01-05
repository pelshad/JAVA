package sec05.exam04_getProperty;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		//운영체제 이름
		String osName = System.getProperty("os.name");
		System.out.println(osName);
		
		//사용자 이름
		String userName = System.getProperty("user.name");
		System.out.println(userName);
		
		//사용자 홈 디렉토리
		String userHome = System.getProperty("user.home");
		System.out.println(userHome);
		
		//프로퍼티 컬랙션 호출
		System.out.println("-----------------------");
		System.out.println(" [key] value");
		System.out.println("-----------------------");
		Properties props = System.getProperties();
		//키만 따로 뽑음
		Set keys = props.keySet();
		for(Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println("[" + key + "] " + value);
		}
	}

}
