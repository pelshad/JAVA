package sec02.exam01_inheritance;

//extends�� ���� CellPhone�� �� ���
//��, private ���������� ���� ��ӵ��� �ʴ´�
//default ���������� �� ���� �ٸ� package��� ��� ���� ����
public class DmbCellPhone extends CellPhone {
	int channel;
	
	DmbCellPhone(String model, String color, int channel){
		//CellPhone�� ��Ӱ�
		this.model = model;
		this.color = color;
		//������ ��
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("ä��" + channel +"�� DMB ��� ������ �����մϴ�.");
	}
	void changeCannelDmb(int Channel) {
		System.out.println("ä��" + channel + "������ �ٲߴϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}
