package sec11.exam01_final;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "ȫ�浿");
		System.out.println(p1.toString());
		
		// p1.nation = "USA";
		// p1.ssn = "654321-1234567"
		// ���̳� �ʵ�� ���� �Ұ�
		p1.name = "�庸��";
		System.out.println(p1.toString());

	}

}
