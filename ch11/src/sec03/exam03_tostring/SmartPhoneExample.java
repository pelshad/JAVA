package sec03.exam03_tostring;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("������", "����");
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		//�ڵ����� toString()ȣ��
		System.out.println(myPhone);
	}

}
