package sec07.exam02_method;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) {
		String str = "안녕하세요";
		
		//바이트 배열에 담기
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length : " + bytes1.length);
		for(byte byte1 : bytes1) {
			System.out.println(byte1);
		}
		
		//바이트 배열을 다시 복원
		String str1 = new String(bytes1);
		System.out.println(str1);
		
		//문자셋으로 byte화
		try {
			//UTF-8 문자셋은 한글을 3바이트로 계산함 
			byte[] bytes2 = str.getBytes("UTF-8");
			System.out.println("bytes2.length : " + bytes2.length);
			//2번째 매개변수에 문자셋을 지정하지 않으면 글자가 깨질 수 있음
			String str2 = new String(bytes2, "UTF-8");
			System.out.println(str2);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
