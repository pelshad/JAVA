package sec02.exam01_byte;

public class garbageValueExample {

	public static void main(String[] args) {
		
		byte var1 = 125;
		
		var1++; //var1은 byte타입이라 var1 + 1은 안됨
		System.out.println(var1); //126
		
		var1++;
		System.out.println(var1); //127
		
		var1++;
		System.out.println(var1); //byte가 가질 수 있는 127을 초과하여 -128 출력
		
		byte var2 = 125;
		int var3 = 125;
		
		for(int i=0; i<5; i++) {
			var2++;
			var3++;
			System.out.println("var2: " + var2 + "\t" + "var3: " + var3);
		}
		
		
	}

}
