package sec03.exam04_clone;

public class MemberExample {
	public static void main(String[] args) {
		Member member = new Member("blue","홍길동","1234",24, true);
		Member cloned = member.getMember();
		
		cloned.password = "4321";
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("id : " + member.id);
		System.out.println("name : " + member.name);
		System.out.println("password : " + member.password);
		System.out.println("age : " + member.age);
		System.out.println("adult : " + member.adult);
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id : " + cloned.id);
		System.out.println("name : " + cloned.name);
		System.out.println("password : " + cloned.password);
		System.out.println("age : " + cloned.age);
		System.out.println("adult : " + cloned.adult);
	}
}
