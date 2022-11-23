package verify.exam06;

public class Parent {
	String nation;
	//super()와 this() 생성자문은 같이 쓸 수 없음
	
	Parent(){
		//super() 불가능
		this("대한민국");
		System.out.println("몇 번째로 나올 메소드?");
	}
	
	Parent(String nation){
		//super() 생성자의 생성위치
		this.nation = nation;
		System.out.println("몇 번째로 나올 메소드?");
	}
	
}
