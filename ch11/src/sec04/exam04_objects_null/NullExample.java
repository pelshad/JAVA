package sec04.exam04_objects_null;

import java.util.Objects;

public class NullExample {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		//객체리턴
		System.out.println(Objects.requireNonNull(str1));
		
		try {
			//null인 경우 예외발생(try catch문 작성)
			System.out.println(Objects.requireNonNull(str2));
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			//null인 경우 예외발생(try catch문 작성)
			System.out.println(Objects.requireNonNull(str2, "이름이 없습니다."));
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		//람다식
		try {
			System.out.println(Objects.requireNonNull(str2, ()->"이름이 없습니다."));
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(Objects.isNull(str1));
		System.out.println(Objects.isNull(str2));
		
		System.out.println(Objects.nonNull(str1));
		System.out.println(Objects.nonNull(str2));
	}

}
