package sec07.exam01_enum;

public class enumMethodsExample {

	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		String name = today.name(); //today���Ű�ü�� ���� �ּҰ� ��������
		System.out.println(name);
		
		int ordinal = today.ordinal(); //���� ����� ����� ����
		System.out.println(ordinal);
		
		Week day1 = Week.MONDAY;     //���� 0
		Week day2 = Week.WEDNESDAY;  //���� 2
		
		int result1 = day1.compareTo(day2); //������ ���̸� ����
		System.out.println(result1);
		
		int result2 = day2.compareTo(day1);
		System.out.println(result2);
		
		Week weekDay = Week.valueOf("SUNDAY"); //valueOf�� �˻��� ���� ���ڿ��� ���� ���� ����� ����
		if(weekDay == Week.SATURDAY||weekDay == Week.SUNDAY) {
			System.out.println("�ָ�");
		} else {
			System.out.println("����");
		}
		
		Week[] days = Week.values();//���� ��ü�� �迭�� ����, ������ �迭�� ���Ű�ü�� ���������� ����
		//values�� ����ϴ� ����, for�� ������ ���Ƽ� ���
		for(Week day : days) {
			System.out.println(day);
		}
	}

}
