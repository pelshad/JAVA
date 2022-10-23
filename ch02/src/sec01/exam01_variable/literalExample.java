package sec01.exam01_variable;

public class literalExample {
	public static void main(String[] args) {
		//정수 출력
		int var1 = 10;
		System.out.println(var1);
		
		int var2 = 010; //8진수
		System.out.println(var2);
		
		int var3 = 0x10; //16진수
		System.out.println(var3);
		
		//실수 출력
		double var4 = 0.25;
		System.out.println(var4);
		
		double var5 = 2E5; //2 x 10의 5승 -> int 타입 아님!
		System.out.println(var5);
		
		//문자 출력
		char var6 = 'A';
		System.out.println(var6);
		
		char var7 = '한';
		System.out.println(var7);
		
		//이스케이프 문자 출력
		System.out.println('\t' + "들여쓰기"); // = "\t들여쓰기"와 동일함
		System.out.println("대한" + '\r' + "민국"); // \n(줄바꿈), \r(맨 앞으로)은 비슷한 기능
		System.out.println("This" + '\'' +"s java");
		System.out.println("이것은 "+"\""+"중요"+"\""+"합니다");
		System.out.println("가격이 " + "\\" + "300입니다.");
		
		//유니코드 출력
		char var8 = '\u0041';
		System.out.println(var8);
		
		//문자열
		System.out.println("java"+8);//정수 리터럴이 문자열로 변환됨
		String var9 = "자바";
		
		//boolean
		boolean var10 = true;
		boolean var11 = false;
		System.out.println(var10);
	}
}
