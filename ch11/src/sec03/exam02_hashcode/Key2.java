package sec03.exam02_hashcode;

public class Key2 {
	public int number;
	
	public Key2(int number) {
		this.number = number;
	}
	
	//equals만 오버라이딩해서는 hashCode의 메소드들을 활용할 수 없다.
	//hashCode는 equals메소드 보다 앞서서 객체를 비교
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()");
		if(obj instanceof Key2) {
			Key2 compareKey = (Key2) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashCode()");
		return number;
	}
}
