package sec03.exam02_hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		//HashMap<key, value> Ű�� �÷������� ����
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		//hashMap.put Ű�� value�� ����
		hashMap.put(new Key(1), "ȫ�浿");
		
		//hashMap.get() Key�� ȣ��
		String value = hashMap.get(new Key(1));
		//key�� int���� ������ �޸� ������ �ٸ��� ������ null�� ���
		//(�������� �������� ����)
		System.out.println(value);
		System.out.println();
		//////////////////////////////////////////////////////////
		HashMap<Key2, String> hashMap2 = new HashMap<Key2, String>();
		hashMap2.put(new Key2(1), "ȫ�浿");
		
		String value2 = hashMap2.get(new Key2(1));
		System.out.println(value2);
		//����Ʈ ������� hashCode()�� �ι� ��µǴ� ����
		//put, get���� ���� hashCode�� ȣ��Ǿ��� ����
	}

}
