package sec11.exam01_arrays;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		char[] arr1 = {'j','a','v','a'};
		//copyOf(�迭��, �� �ε���)
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		//copyOfRange(�迭��, �����ε���, �� �ε��� ������)
		//�迭�� ���� �� = �� �ε��� - ���� �ε���
		char[] arr3 = Arrays.copyOfRange(arr2, 1, 3);
		System.out.println(Arrays.toString(arr3));
		//System.arraycopy(���� �迭, ���� �ε���, Ÿ�� �迭, Ÿ�� �迭 ���� �����ε���, ���� ����)
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		for(char item : arr4) {
			System.out.println(item);
		}
		
	}

}
