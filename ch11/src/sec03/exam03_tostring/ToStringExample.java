package sec03.exam03_tostring;

import java.util.Date;

public class ToStringExample {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		
		//obj1�� toString�޼ҵ尡 �ڵ����� ȣ��ȴ�.
		System.out.println(obj1);
		//DateŸ�� ��ü�� obj2�� toString�޼ҵ�� �⺻������ �������̵��Ǿ� ��¥ ���
		System.out.println(obj2);
	}

}
