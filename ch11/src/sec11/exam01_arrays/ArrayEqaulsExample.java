package sec11.exam01_arrays;

import java.util.Arrays;

public class ArrayEqaulsExample {

	public static void main(String[] args) {
		int[][] origin= {{1,2},{1,4}};
		
		//���� ����(equals) : ������ ��
		int[][] clone1 = Arrays.copyOf(origin, origin.length);
		System.out.println("�迭 ���� �� : " + origin.equals(clone1));
		
		
	}

}
