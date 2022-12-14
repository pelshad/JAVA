package sec05_try_with_resources;

public class FileInputStream implements AutoCloseable{
	//try-with-resources
	//예외발생 여부와 상관없이 사용했던 리스소 객체(각종 입출력스트림, 서버소켓, 소켓, 각종 채널)의 
	//close() 메소드를 호출해서 안전하게 리소스를 닫아준다.
	
	//사용조건
	//java.lang.autoclosealbe 인터페이스를 구현하고 있어야 한다.
	
	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file + "을 읽습니다.");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println(file + "을 닫습니다.");
	}
	
}
