package sec11.exam01_final;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동");
		System.out.println(p1.toString());
		
		// p1.nation = "USA";
		// p1.ssn = "654321-1234567"
		// 파이널 필드라 수정 불가
		p1.name = "장보고";
		System.out.println(p1.toString());

	}

}
