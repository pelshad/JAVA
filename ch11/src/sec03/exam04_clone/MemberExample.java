package sec03.exam04_clone;

public class MemberExample {
	public static void main(String[] args) {
		Member member = new Member("blue","ȫ�浿","1234",24, true);
		Member cloned = member.getMember();
		
		cloned.password = "4321";
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id : " + member.id);
		System.out.println("name : " + member.name);
		System.out.println("password : " + member.password);
		System.out.println("age : " + member.age);
		System.out.println("adult : " + member.adult);
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id : " + cloned.id);
		System.out.println("name : " + cloned.name);
		System.out.println("password : " + cloned.password);
		System.out.println("age : " + cloned.age);
		System.out.println("adult : " + cloned.adult);
	}
}
