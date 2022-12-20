package sec03.exam05_deep_clone;

public class MemberExample {
	public static void main(String[] args) {
		Member original = new Member("홍길동", 24, new int[] {90,90}, new Car("모닝"));
		
		Member cloned = original.getMember();
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("id : " + original.name);
		System.out.println("name : " + original.age);
		System.out.print("scores : {");
		for(int score : original.scores) {
			System.out.print(score);
		};
		System.out.println("}");
		System.out.println(original.car.model);

		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id : " + cloned.name);
		System.out.println("name : " + cloned.age);
		cloned.scores[0] = 80;
		System.out.print("scores : {");
		for(int score : cloned.scores) {
			System.out.print(score);
		};
		System.out.println("}");
		cloned.car.model = "레이";
		System.out.println(cloned.car.model);
		//clone()메소드를 재정의 하지 않으면 어느쪽의 참조타입을 수정하여도 둘다 수정됨
	}
}
