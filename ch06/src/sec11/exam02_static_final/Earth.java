package sec11.exam02_static_final;

public class Earth {
	//상수 = static final field
	//이름은 전부 대문자가 관례
	//단어 결합시 _로 연결한다.
	//설정 방법. 1.선언 2.static블록
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SERFACE_AREA;
	static {
		EARTH_SERFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
		// * Math.PI는자 자바에서 제공하는 값
		// Math class의 PI 상수를 불러온다.(이 값 또한 static final)
	}
}
