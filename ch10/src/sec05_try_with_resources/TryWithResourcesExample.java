package sec05_try_with_resources;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file.txt")) {
			//try 블록이 끝나면 자동적으로 close() 메소드 호출
			fis.read();
			
			//예외를 강제로 발생시킴
			throw new Exception();
		} catch(Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}
		
	}

}
