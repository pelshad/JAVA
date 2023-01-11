package sec07.exam02_method;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = new String("홍길동");
		String strVar2 = "홍길동";
		String strVar3 = "홍길동";
		
		//new로 생성된 문자열 객체는 서로 다른 주소값을 가짐
		if(strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		//선언형으로 만들어진 문자열 객체는 같은 주소값을 가짐
		if(strVar2 == strVar3) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		
		//equals는 object가 가진 메소드로 주소값을 참조하여 true/false를 리턴하나
		//String타입에서 override되어 문자열 자체를 비교하여 true/false를 리턴한다.
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 문자열임");
		} else {
			System.out.println("다른 문자열임");
		}
		
		if(strVar2.equals(strVar3)) {
			System.out.println("같은 문자열임");
		} else {
			System.out.println("다른 문자열임");
		}
		
	}

}
