package sec08.exam04_overloading;

public class Calculator {
	// �޼ҵ� �����ε� :: �ϳ��� �޼ҵ忡 �پ��� �Ķ������ ���� ����
	// �ڼ��Ѱ� ������ �����ε� ����
	double areaRectangle(double width) {
		return width*width;
	}
	
	double areaRectangle(double width, double height) {
		return width*height;
	}
	
	
}
