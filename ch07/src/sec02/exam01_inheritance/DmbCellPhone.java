package sec02.exam01_inheritance;

//extends를 통해 CellPhone의 값 상속
//단, private 접근제한자 값은 상속되지 않는다
//default 접근제한자 값 또한 다른 package라면 상속 되지 않음
public class DmbCellPhone extends CellPhone {
	int channel;
	
	DmbCellPhone(String model, String color, int channel){
		//CellPhone의 상속값
		this.model = model;
		this.color = color;
		//본인의 값
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널" + channel +"번 DMB 방송 수신을 시작합니다.");
	}
	void changeCannelDmb(int Channel) {
		System.out.println("채널" + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
