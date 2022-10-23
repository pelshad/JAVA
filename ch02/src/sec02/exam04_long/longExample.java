package sec02.exam04_long;

public class longExample {
	public static void main(String[] args) {
		
		long var1 = 10;
		long var2 = 20L; //L을 붙이면 8byte수로 해석하라고 알려줌

		//long var3 = 10000000000; //4byte로 해석하여 에러
		long var4 = 10000000000L;  //8byte로 해석하여 에러 X
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		
	}
}
