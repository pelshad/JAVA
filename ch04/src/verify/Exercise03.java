package verify;

public class Exercise03 {
	public static void main(String[] args) {
		//for���� Ȱ���Ͽ� 1~100���� 3�� ����� ��
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
