package sec07.exam02_method;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) {
		String str = "�ȳ��ϼ���";
		
		//����Ʈ �迭�� ���
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length : " + bytes1.length);
		for(byte byte1 : bytes1) {
			System.out.println(byte1);
		}
		
		//����Ʈ �迭�� �ٽ� ����
		String str1 = new String(bytes1);
		System.out.println(str1);
		
		//���ڼ����� byteȭ
		try {
			//UTF-8 ���ڼ��� �ѱ��� 3����Ʈ�� ����� 
			byte[] bytes2 = str.getBytes("UTF-8");
			System.out.println("bytes2.length : " + bytes2.length);
			//2��° �Ű������� ���ڼ��� �������� ������ ���ڰ� ���� �� ����
			String str2 = new String(bytes2, "UTF-8");
			System.out.println(str2);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
