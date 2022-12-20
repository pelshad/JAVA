package sec03.exam05_deep_clone;

public class MemberExample {
	public static void main(String[] args) {
		Member original = new Member("ȫ�浿", 24, new int[] {90,90}, new Car("���"));
		
		Member cloned = original.getMember();
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id : " + original.name);
		System.out.println("name : " + original.age);
		System.out.print("scores : {");
		for(int score : original.scores) {
			System.out.print(score);
		};
		System.out.println("}");
		System.out.println(original.car.model);

		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id : " + cloned.name);
		System.out.println("name : " + cloned.age);
		cloned.scores[0] = 80;
		System.out.print("scores : {");
		for(int score : cloned.scores) {
			System.out.print(score);
		};
		System.out.println("}");
		cloned.car.model = "����";
		System.out.println(cloned.car.model);
		//clone()�޼ҵ带 ������ ���� ������ ������� ����Ÿ���� �����Ͽ��� �Ѵ� ������
	}
}
