package beakjoon_ch03;

import java.util.Scanner;

public class num10951 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//hasNextInt : ������� ��Ʈ �� ��� true ����
		//���� �������� �Ȱɾ�θ� ��Ÿ�� ������
		//�װ� �� �̸� �������� �ʹ� �ϳ� �̰�
		while(scan.hasNextInt()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int sum = a + b;
			System.out.println(sum);
		}
	}
}
