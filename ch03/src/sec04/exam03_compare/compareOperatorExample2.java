package sec04.exam03_compare;

public class compareOperatorExample2 {
	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); //순환소수 0.1의 저장 공간이 서로 달라서 false 출력
		System.out.println((float)v4 == v5);
		System.out.println((int)(v4*10) == (int)(v5*10));
		
	}

}
