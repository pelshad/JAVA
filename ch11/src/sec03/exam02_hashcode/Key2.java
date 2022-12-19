package sec03.exam02_hashcode;

public class Key2 {
	public int number;
	
	public Key2(int number) {
		this.number = number;
	}
	
	//equals�� �������̵��ؼ��� hashCode�� �޼ҵ���� Ȱ���� �� ����.
	//hashCode�� equals�޼ҵ� ���� �ռ��� ��ü�� ��
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()");
		if(obj instanceof Key2) {
			Key2 compareKey = (Key2) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashCode()");
		return number;
	}
}
