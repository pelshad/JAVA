package verify.exam06;

public class Parent {
	String nation;
	//super()�� this() �����ڹ��� ���� �� �� ����
	
	Parent(){
		//super() �Ұ���
		this("���ѹα�");
		System.out.println("�� ��°�� ���� �޼ҵ�?");
	}
	
	Parent(String nation){
		//super() �������� ������ġ
		this.nation = nation;
		System.out.println("�� ��°�� ���� �޼ҵ�?");
	}
	
}
