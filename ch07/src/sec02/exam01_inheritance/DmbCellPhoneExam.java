package sec02.exam01_inheritance;

public class DmbCellPhoneExam {

	public static void main(String[] args) {
		DmbCellPhone phone = new DmbCellPhone("애플", "그레이", 10);
		phone.powerOn();
		
		System.out.println("모델 : " + phone.model);
		System.out.println("색상 : " + phone.color);
		System.out.println("채널 : " + phone.channel);
		System.out.println();
		
		phone.bell();
		phone.sendVoice("안녕하세요");
		phone.receiveVoice("네 반갑습니다");
		phone.sendVoice("네");
		phone.hangUp();
		
	}

}
