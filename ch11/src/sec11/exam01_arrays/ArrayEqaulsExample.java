package sec11.exam01_arrays;

import java.util.Arrays;

public class ArrayEqaulsExample {

	public static void main(String[] args) {
		int[][] origin= {{1,2},{1,4}};
		
		//얕은 복사(equals) : 참조값 비교
		int[][] clone1 = Arrays.copyOf(origin, origin.length);
		System.out.println("배열 번지 비교 : " + origin.equals(clone1));
		
		
	}

}
