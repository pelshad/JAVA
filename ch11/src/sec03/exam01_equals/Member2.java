package sec03.exam01_equals;

public class Member2 {
	//�޼ҵ尡 �������̵��� Member2
	public String id;
	public Member2(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			//���� Ÿ���� �ν��Ͻ����� ��
			Member2 member = (Member2) obj;
			if(id.equals(member.id)) {
				//�ʵ��� id�� �Ķ���ͷ� ������ id���� ��
				return true;
			}
		}
		return false;
	}
}
