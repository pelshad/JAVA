package sec03.exam01_equals;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		//주소값을 비교하는 equals
		if(obj1.equals(obj2)) { // (obj1 == obj2)와 동일
			System.out.println("동등한 객체입니다.");
		} else {
			System.out.println("동등하지 않습니다.");
		}

		if(obj1.equals(obj2)) {
			System.out.println("동등한 객체입니다.");
		} else {
			System.out.println("동등하지 않습니다.");
		}
		System.out.println();
		//////////////////////////////////////////////
		//equals()가 오버라이딩된 Member2객체
		Member2 obj4 = new Member2("blue");
		Member2 obj5 = new Member2("blue");
		Member2 obj6 = new Member2("red");
		
		//주소값을 비교하는 equals
		if(obj4.equals(obj5)) {
			System.out.println("동등한 객체입니다.");
		} else {
			System.out.println("동등하지 않습니다.");
		}

		if(obj4.equals(obj6)) {
			System.out.println("동등한 객체입니다.");
		} else {
			System.out.println("동등하지 않습니다.");
		}
		
	}
}
