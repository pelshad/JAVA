package sec02.exam02_switch;

public class switchBobreakCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = (int)(Math.random()*4) + 8;
		System.out.println("[����ð� : " + time +"��]");
		
		switch(time) {
			case 8:
				System.out.println("����մϴ�.");
			case 9:
				System.out.println("ȸ���մϴ�.");
			case 10:
				System.out.println("�����մϴ�.");
			default:
				System.out.println("�ٰܱ��ϴ�.");
			
		}
	}

}
