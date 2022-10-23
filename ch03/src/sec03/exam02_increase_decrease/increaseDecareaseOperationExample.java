package sec03.exam02_increase_decrease;

public class increaseDecareaseOperationExample {
	public static void main(String[] args) {
		int x  = 10;
		int y = 10;
		int z;
		
		System.out.println("-------------");
		x++;
		++x;
		System.out.println("x=" + x); //단독으로 단항 연산자가 사용되면 값이 바로 변경됨
		
		System.out.println("-------------");
		y--;
		--y;
		System.out.println("y=" + y);
		
		System.out.println("-------------");
		z = x++; 
		System.out.println("z=" + z); //연산식에 피연산자++ 이면 연산식 이후 ++을 처리
		System.out.println("x=" + x);
		
		System.out.println("-------------");
		z = ++x; 
		System.out.println("z=" + z); //연산식에 ++피연산자 이면 피연산자 ++ 처리후 연산식 처리
		System.out.println("x=" + x);
		
		System.out.println("-------------");
		z = ++x + y++;
		System.out.println("z=" + z);
	}
}
