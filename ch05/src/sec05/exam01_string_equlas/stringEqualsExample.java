package sec05.exam01_string_equlas;

public class stringEqualsExample {

	public static void main(String[] args) {
		//
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		if(strVar1 == strVar2) {
			System.out.println("같은 주소를 참조");
		} else {
			System.out.println("같은 주소를 참조하지 않음");
		}
		
		//new로 생성된 객체는 다른 주소(heap영역 )을 참조
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		if(strVar3 == strVar4) {
			System.out.println("같은 주소를 참조");
		} else {
			System.out.println("같은 주소를 참조하지 않음");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("같은 문자열을 가지고 있음");
		}

	}

}
