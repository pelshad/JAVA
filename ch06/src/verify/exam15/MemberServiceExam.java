package verify.exam15;

public class MemberServiceExam {
	public static void main(String[] args) {
		MemberSerivce service = new MemberSerivce();
		
		boolean result = service.login("hong", "12345");
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�");
			service.logout("hong");
		} else {
			System.out.println("id �Ǵ� passowrd�� �ùٸ��� �ʽ��ϴ�.");
		}
	}
} 