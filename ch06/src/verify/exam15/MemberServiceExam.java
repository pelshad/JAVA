package verify.exam15;

public class MemberServiceExam {
	public static void main(String[] args) {
		MemberSerivce service = new MemberSerivce();
		
		boolean result = service.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다");
			service.logout("hong");
		} else {
			System.out.println("id 또는 passowrd가 올바르지 않습니다.");
		}
	}
} 