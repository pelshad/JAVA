package sec07.exam01_enum;

import java.util.Calendar;

public class enumWeekExample {

	public static void main(String[] args) {
		
		//Week today = Week.FIRDAY; Week.java�� �ִ� ����� �ҷ���
		Week today = null;
		
		Calendar cal = Calendar.getInstance(); //���� ��¥�� �����ִ� �޼ҵ�
		int week = cal.get(Calendar.DAY_OF_WEEK); //������ ������ �����ִ� �޼ҵ�
		System.out.println(week); //1�Ͽ��� ~ 7�����
		
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
		
		System.out.println("���� ���� : " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("�Ͽ��� �Դϴ�.");
		} else {
			System.out.println("�Ͽ����� �ƴմϴ�.");
		}
	}

}
