package sec07.exam01_constructor;

public class KeyboardToStringExample {

	public static void main(String[] args) throws Exception {
		byte[] bytes = new byte[100];
		System.out.print("입력 : ");
		//키보드로부터 받은 문자열 값을 byte값으로 저장
		int readByteNo = System.in.read(bytes);
		
		//bytes 배열 0에서 readByteNo-2까지를 문자열로 반환
		//-2를 하는 이유는 입력된 부분에서 엔터를 치면 \r \n의 바이트 값도 배열에 저장됨
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
	}

}
