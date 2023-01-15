package sec09.exam01_string_buffer_builder;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		//insert(n, String) : n번째 인덱스에 String Insert
		sb.insert(4, "1");
		System.out.println(sb.toString());
		
		//setCharAt(n, Char) : n번째 인덱스 문자를 '문자(Char)'로 변경
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		//sb.replace(sn, en, String) : sn부터 en 번째 인덱스까지 String
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		
		//sb.delete(sn, en) : sn부터 en 인덱스까지 제거
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println(length);
		
		//builder를 String으로 바꿈//
		String result = sb.toString();
		System.out.println(result);
	}

}
