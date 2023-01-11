package sec07.exam02_method;

public class StringIndexOfExample {

	public static void main(String[] args) {
		//문자열 찾기(indexOf)
		//매개값으로 주어진 문자열이 시작되는 인덱스를 리턴
		//주어진 문자열이 포함되어 있지 않으면 -1을 리턴
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바가 포함되어 있습니다.");
		} else {
			System.out.println("자바가 포함되어 있지 않습니다.");
		}
	}

}
