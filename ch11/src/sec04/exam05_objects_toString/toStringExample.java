package sec04.exam05_objects_toString;

import java.util.Objects;

public class toStringExample {

	public static void main(String[] args) {
		String str1 = "ȫ�浿";
		String str2 = null;
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		
		System.out.println();
		
		System.out.println(Objects.toString(str1, "�� ���Դϴ�."));
		System.out.println(Objects.toString(str2, "�� ���Դϴ�."));
	}

}
