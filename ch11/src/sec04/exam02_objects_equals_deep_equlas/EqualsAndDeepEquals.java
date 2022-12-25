package sec04.exam02_objects_equals_deep_equlas;

import java.util.Objects;

public class EqualsAndDeepEquals {

	public static void main(String[] args) {
		//Integer :: int 데이터를 담는 Integer클래스
		Integer o1 = 1000;
		Integer o2 = 1000;
		//Integer의 equals메소드는 내부의 int값이 같으면 true를 리턴하도록
		//재정의되어 있다
		System.out.println(Objects.equals(o1, o2));
		// == o1.equals(o2);
		//둘 중 하나의 값이 null이면 false
		System.out.println(Objects.equals(o1, null));
		//둘 다 null이면 true
		System.out.println(Objects.equals(null, null));
		//배열이 아니면 deepEquals의 기능은 equals와 동일
		System.out.println(Objects.deepEquals(o1, o2));
		System.out.println();
		
		
		Integer[] arr1 = {1,2};
		Integer[] arr2 = {1,2};
		//서로의 번지가 다르기 때문에 false
		System.out.println(Objects.equals(arr1, arr2));
		//배열인 경우 배열의 번지가 달라도 데이터가 같으면 true
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Objects.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, null));
	}

}
