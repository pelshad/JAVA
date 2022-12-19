package sec03.exam01_equals;

public class Member2 {
	//메소드가 오버라이딩된 Member2
	public String id;
	public Member2(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			//같은 타입의 인스턴스인지 비교
			Member2 member = (Member2) obj;
			if(id.equals(member.id)) {
				//필드의 id와 파라미터로 보내진 id값을 비교
				return true;
			}
		}
		return false;
	}
}
