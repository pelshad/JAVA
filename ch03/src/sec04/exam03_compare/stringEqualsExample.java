package sec04.exam03_compare;

public class stringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		String strVar3 = new String("홍길동");
		
		System.out.println(strVar1 == strVar2); //참조하는 위치가 같음
		System.out.println(strVar1 == strVar3); //참조하는 위치가 다름
		System.out.println("------------------");
		System.out.println(strVar1.equals(strVar2)); //문자 자체를 비교, 같음
		System.out.println(strVar1.equals(strVar3)); //문자 자체를 비교, 같음
	}
}
