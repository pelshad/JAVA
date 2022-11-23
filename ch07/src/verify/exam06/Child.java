package verify.exam06;

public class Child extends Parent {
	String name;
	
	Child() {
		this("홍길동");
		System.out.println("몇 번째로 나올 메소드?");
	}
	
	Child(String name){
		this.name = name;
		System.out.println("몇 번째로 나올 메소드?");
	}

}
