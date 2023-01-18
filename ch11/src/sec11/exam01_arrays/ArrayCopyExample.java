package sec11.exam01_arrays;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		char[] arr1 = {'j','a','v','a'};
		//copyOf(배열명, 끝 인덱스)
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		//copyOfRange(배열명, 시작인덱스, 끝 인덱스 전까지)
		//배열에 들어가는 수 = 끝 인덱스 - 시작 인덱스
		char[] arr3 = Arrays.copyOfRange(arr2, 1, 3);
		System.out.println(Arrays.toString(arr3));
		//System.arraycopy(원본 배열, 시작 인덱스, 타겟 배열, 타겟 배열 복사 시작인덱스, 복사 갯수)
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		for(char item : arr4) {
			System.out.println(item);
		}
		
	}

}
