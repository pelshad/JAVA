package sec02.exam02_constant_field;

public interface RemoteControl {
	//인터페이스의 필드는 자동으로 상수로 생성된다
	//(public static final을 따로 붙이지 않아도 붙은 효과가 남)
	//따라서 필드명은 상수를 만들때와 같이 대문자와 _를 이용하여 만들어야 된다.
	//class의 상수와 달리 선언과 동시에 값을 줘야한다.
	
	//int MAX_VALUME; 컴파일 에러
	
	//static 블록이 따로 존재하지 않기 때문에 블록을 통해 값을 주는 것도 X
	/* int MIN_VOLUME;
	static {MIN_VOLUME = 0;} */
	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
}
