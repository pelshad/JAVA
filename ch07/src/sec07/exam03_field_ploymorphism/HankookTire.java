package sec07.exam03_field_ploymorphism;

//부모 생성자에 매개변수값이 있기때문에 super생성자를 만들지 않으면 컴파일 에러
public class HankookTire extends Tire{
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire 수명 : " + (maxRotation - accumulatedRotation));
			return true;
		}
		System.out.println("*** " + location + "HankookTire 수명이 다되었습니다 ***");
		return false;
	}
}
