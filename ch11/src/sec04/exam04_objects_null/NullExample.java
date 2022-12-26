package sec04.exam04_objects_null;

import java.util.Objects;

public class NullExample {

	public static void main(String[] args) {
		String str1 = "ȫ�浿";
		String str2 = null;
		
		//��ü����
		System.out.println(Objects.requireNonNull(str1));
		
		try {
			//null�� ��� ���ܹ߻�(try catch�� �ۼ�)
			System.out.println(Objects.requireNonNull(str2));
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			//null�� ��� ���ܹ߻�(try catch�� �ۼ�)
			System.out.println(Objects.requireNonNull(str2, "�̸��� �����ϴ�."));
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		//���ٽ�
		try {
			System.out.println(Objects.requireNonNull(str2, ()->"�̸��� �����ϴ�."));
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(Objects.isNull(str1));
		System.out.println(Objects.isNull(str2));
		
		System.out.println(Objects.nonNull(str1));
		System.out.println(Objects.nonNull(str2));
	}

}
