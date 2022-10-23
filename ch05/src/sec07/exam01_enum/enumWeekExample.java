package sec07.exam01_enum;

import java.util.Calendar;

public class enumWeekExample {

	public static void main(String[] args) {
		
		//Week today = Week.FIRDAY; Week.java에 있는 상수를 불러옴
		Week today = null;
		
		Calendar cal = Calendar.getInstance(); //현재 날짜를 돌려주는 메소드
		int week = cal.get(Calendar.DAY_OF_WEEK); //오늘의 요일을 돌려주는 메소드
		System.out.println(week); //1일요일 ~ 7토요일
		
		switch(week) {
			case 1:
				today = Week.SUNDAY;
				break;
			case 2:
				today = Week.MONDAY;
				break;
			case 3:
				today = Week.TUESDAY;
				break;
			case 4:
				today = Week.WEDNESDAY;
				break;
			case 5:
				today = Week.THURSDAY;
				break;
			case 6:
				today = Week.FRIDAY;
				break;
			case 7:
				today = Week.SATURDAY;
				break;
		}
		
		System.out.println("오늘 요일 : " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일 입니다.");
		} else {
			System.out.println("일요일이 아닙니다.");
		}
	}

}
