package sec08.exam01_method_declaration;

public class Computer {
	//�Ķ������ ���� �󸶳� ������ ������ ���� ���
	
	// �迭��
	public int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	//...��
	//...�� �迭�� �Ȱ��� ����
	public int sum2(int ... values) {
		int sum = 0;
		for(int i=0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
