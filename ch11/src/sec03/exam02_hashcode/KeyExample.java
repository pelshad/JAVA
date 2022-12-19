package sec03.exam02_hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		//HashMap<key, value> 키를 컬렉션으로 저장
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		//hashMap.put 키에 value값 삽입
		hashMap.put(new Key(1), "홍길동");
		
		//hashMap.get() Key값 호출
		String value = hashMap.get(new Key(1));
		//key의 int값은 같더라도 메모리 번지가 다르기 때문에 null값 출력
		//(논리적으로 동등하지 않음)
		System.out.println(value);
		System.out.println();
		//////////////////////////////////////////////////////////
		HashMap<Key2, String> hashMap2 = new HashMap<Key2, String>();
		hashMap2.put(new Key2(1), "홍길동");
		
		String value2 = hashMap2.get(new Key2(1));
		System.out.println(value2);
		//프린트 결과에서 hashCode()가 두번 출력되는 이유
		//put, get에서 각각 hashCode가 호출되었기 때문
	}

}
