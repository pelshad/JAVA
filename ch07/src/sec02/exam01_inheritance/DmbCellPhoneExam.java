package sec02.exam01_inheritance;

public class DmbCellPhoneExam {

	public static void main(String[] args) {
		DmbCellPhone phone = new DmbCellPhone("����", "�׷���", 10);
		phone.powerOn();
		
		System.out.println("�� : " + phone.model);
		System.out.println("���� : " + phone.color);
		System.out.println("ä�� : " + phone.channel);
		System.out.println();
		
		phone.bell();
		phone.sendVoice("�ȳ��ϼ���");
		phone.receiveVoice("�� �ݰ����ϴ�");
		phone.sendVoice("��");
		phone.hangUp();
		
	}

}
