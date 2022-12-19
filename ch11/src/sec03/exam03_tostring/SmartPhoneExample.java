package sec03.exam03_tostring;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("아이폰", "애플");
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		//자동으로 toString()호출
		System.out.println(myPhone);
	}

}
