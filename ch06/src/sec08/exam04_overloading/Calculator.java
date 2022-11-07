package sec08.exam04_overloading;

public class Calculator {
	// 메소드 오버로딩 :: 하나의 메소드에 다양한 파라미터의 값을 넣음
	// 자세한건 생성자 오버로딩 참고
	double areaRectangle(double width) {
		return width*width;
	}
	
	double areaRectangle(double width, double height) {
		return width*height;
	}
	
	
}
