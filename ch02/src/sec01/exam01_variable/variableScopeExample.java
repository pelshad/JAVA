package sec01.exam01_variable;

public class variableScopeExample {
	public static void main(String[] args) {
		int var1;
		
		if(true) {
			int var2;
			
			var1 = 10;
			var2 = 20;//if문 안에서 만들어진 변수라 사용가능
		}
		
		var1 = 10;
		//var2 = 20; if문 밖에선 scope가 벗어남
		
		for(int i=0; i<10; i++) {
			int var3;
			
			var1 = 10;
			var3 = 30;//for문 안에서 만들어진 변수라 사용가능
		}
		
		var1 = 10;
		//var3 = 30; for문 밖에선 scope 벗어남
	}
}
