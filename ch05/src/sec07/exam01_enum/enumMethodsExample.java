package sec07.exam01_enum;

public class enumMethodsExample {

	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		String name = today.name(); //today열거객체가 가진 주소값 가져오기
		System.out.println(name);
		
		int ordinal = today.ordinal(); //열거 상수의 선언된 순번
		System.out.println(ordinal);
		
		Week day1 = Week.MONDAY;     //순번 0
		Week day2 = Week.WEDNESDAY;  //순번 2
		
		int result1 = day1.compareTo(day2); //순번의 차이를 리턴
		System.out.println(result1);
		
		int result2 = day2.compareTo(day1);
		System.out.println(result2);
		
		Week weekDay = Week.valueOf("SUNDAY"); //valueOf로 검색된 같은 문자열을 가진 열거 상수를 리턴
		if(weekDay == Week.SATURDAY||weekDay == Week.SUNDAY) {
			System.out.println("주말");
		} else {
			System.out.println("평일");
		}
		
		Week[] days = Week.values();//열거 객체의 배열을 리턴, 생성된 배열은 열거객체의 생성번지를 가짐
		//values를 사용하는 이유, for을 돌리기 좋아서 사용
		for(Week day : days) {
			System.out.println(day);
		}
	}

}
