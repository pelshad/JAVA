package sec03.exam01_equals;

public class Member {
	//Object 클래스의 메소드 equals()
	//객체를 비교하는 메소드
	//기본적으로는 == 연산자와 동일한 결과를 리턴한다(번지 비교)
	//하지만 보통 논리적 동등(객체가 서로 다르더라도 그 객체의 데이터가 같다면 같다고 보는것)
	//을 위해 직접적으로 사용하기보단 오버라이딩하여 사용한다.
	//대표적으로 String의 equals() 메소드
	
	//단,equals() 메소드만으로 완전한 논리적 동등이라고 할 수는 없음
	//다음장 hashCode()참고
	public String id;
	public Member(String id) {
		this.id = id;
	}
	
	
}
