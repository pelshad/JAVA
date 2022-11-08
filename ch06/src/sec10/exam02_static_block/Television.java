package sec10.exam02_static_block;

public class Television {
	// 인스턴스 필드와 메소드의 경우 생성자를 통해 초기화를 이룸
	// Television(){...} << 생성자, 기억 안나면 앞 내용 참고
	
	// 정적 필드와 메소드의 경우 정적 초기화 블록을 사용
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	static int from1To10Sum;
	
	//정적 초기화 블록
	static {
		info = company + "-" + model;
		
		int sum = 0;
		for(int i=1; i<=10;i++) {
			sum += i;
		}
		from1To10Sum = sum;
	}
	//정적 초기화 블록을 사용하는 이유
	//for, if문과 같은 실행문을 넣어 복잡한 계산이 필요한 값들을 넣을 수 있음
}
