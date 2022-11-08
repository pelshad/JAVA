package sec09.exam01_instance_member;

public class Car {
	//인스턴스 멤버(필드)
	String model;
	int speed;
	
	Car(String model){
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i = 10; i<=50; i++) {
			//setSpeed(i); 이렇게 해도 작동함
			this.setSpeed(i); // this를 붙임으로 명시적으로 지정 가능
			//System.out.println(model + "가 달립니다.");
			//parameter에 model이 없기 때문에 this가 없어서 정상적으로 읽음
			//하지만 명시적으로 지정하기 위해서 this를 사용
			System.out.println(this.model + "(이)가 달립니다.(시속:" + this.speed + "km/h)");
			//굳이 꼭 this를 안써도 되긴함. 그래도 가능하면 가시성을 위해 사용
			//this는 인스턴스 필드(메소드에서만 사용가능) static에선 사용 안됨.
		}
	}
}
