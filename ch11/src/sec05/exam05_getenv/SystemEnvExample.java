package sec05.exam05_getenv;

public class SystemEnvExample {

	public static void main(String[] args) {
		//ȯ�溯���� ��������
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println(javaHome);
	}

}
