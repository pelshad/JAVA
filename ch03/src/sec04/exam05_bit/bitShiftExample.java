package sec04.exam05_bit;

public class bitShiftExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1 << 3 = " + (1 << 3));
		System.out.println("-8 >> 3 = " + (-8 >> 3));
		System.out.println("-8 >>> 3 = " + (-8 >>> 3));
		
		System.out.println(toBinaryString(-8));
		System.out.println(">> 3 = ");
		System.out.println(toBinaryString(-8 >> 3));
		System.out.println();
		System.out.println(toBinaryString(-8));
		System.out.println(">>> 3 = ");
		System.out.println(toBinaryString(-8 >>> 3));
		// >> 최상위 비트에 최상위 비트랑 같은 값을 넣음
		// >>> 최상위 비트에 0을 집어넣음
	}
	
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}

}
