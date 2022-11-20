package sec07.exam03_field_ploymorphism;

public class Tire {
	public int maxRotation; //최대 회전수
	public int accumulatedRotation; //누적 회전수
	public String location; //타이어의 위치
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명 : " + (maxRotation - accumulatedRotation));
			return true;
		}
		System.out.println("*** " + location + "Tire 수명이 다되었습니다 ***");
		return false;
	}
}
