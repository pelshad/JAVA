package sec03.exam05_deep_clone;

import java.util.Arrays;

public class Member implements Cloneable{
	//얕은 복제 대상
	public String name;
	public int age;
	//참조타입 필드(clone시 주소값만 복제)
	public int[] scores;
	public Car car;
	
	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//얕은 복제가되는 필드를 복제하기 위해 부모(Object) clone메소드 호출
		Member cloned = (Member) super.clone();
		//배열을 복제하는 메소드
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		//복제할 객체의 생성자 호출
		cloned.car = new Car(this.car.model);
		return cloned;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			//오버라이딩된 클론메소드 호출
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
}
