package verify;

public class Exercise04 {
	public static void main(String[] args) {
		//�ֻ��� 2���� ������ ���� ���� 5�� �ɶ����� �ݺ��Ǵ� while�� �ۼ�
		
		while(true) {
			int first = (int)(Math.random()*6) + 1;
			int second = (int)(Math.random()*6) + 1;
			System.out.println("(" + first +", "+ second+")");
			if(first+second == 5) {
				break;
			}
		}
	}
}
