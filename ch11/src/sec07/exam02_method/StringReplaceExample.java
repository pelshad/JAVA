package sec07.exam02_method;

public class StringReplaceExample {

	public static void main(String[] args) {
		// replace()
		// 기존 문자열을 바꾸어 새로운 문자열로 생성(기존 문자열 객체를 바꾸는거 X)
		String oldStr = "자바 공부중";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
