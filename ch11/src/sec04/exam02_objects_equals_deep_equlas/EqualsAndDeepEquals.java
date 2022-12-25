package sec04.exam02_objects_equals_deep_equlas;

import java.util.Objects;

public class EqualsAndDeepEquals {

	public static void main(String[] args) {
		//Integer :: int �����͸� ��� IntegerŬ����
		Integer o1 = 1000;
		Integer o2 = 1000;
		//Integer�� equals�޼ҵ�� ������ int���� ������ true�� �����ϵ���
		//�����ǵǾ� �ִ�
		System.out.println(Objects.equals(o1, o2));
		// == o1.equals(o2);
		//�� �� �ϳ��� ���� null�̸� false
		System.out.println(Objects.equals(o1, null));
		//�� �� null�̸� true
		System.out.println(Objects.equals(null, null));
		//�迭�� �ƴϸ� deepEquals�� ����� equals�� ����
		System.out.println(Objects.deepEquals(o1, o2));
		System.out.println();
		
		
		Integer[] arr1 = {1,2};
		Integer[] arr2 = {1,2};
		//������ ������ �ٸ��� ������ false
		System.out.println(Objects.equals(arr1, arr2));
		//�迭�� ��� �迭�� ������ �޶� �����Ͱ� ������ true
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Objects.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, null));
	}

}
