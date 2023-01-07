package sec05.exam05_getenv;

public class SystemEnvExample {

	public static void main(String[] args) {
		//환경변수값 가져오기
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println(javaHome);
	}

}
