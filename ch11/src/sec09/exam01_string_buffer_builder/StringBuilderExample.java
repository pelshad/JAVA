package sec09.exam01_string_buffer_builder;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		//insert(n, String) : n��° �ε����� String Insert
		sb.insert(4, "1");
		System.out.println(sb.toString());
		
		//setCharAt(n, Char) : n��° �ε��� ���ڸ� '����(Char)'�� ����
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		//sb.replace(sn, en, String) : sn���� en ��° �ε������� String
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		
		//sb.delete(sn, en) : sn���� en �ε������� ����
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println(length);
		
		//builder�� String���� �ٲ�//
		String result = sb.toString();
		System.out.println(result);
	}

}
