package sec07.exam05_method_polymorphism;

public class Driver {
	public void drive(Vehicle vehicle) {
		//매개변수 안에는 Vehicle의 자식인 객체도 넣을 수 있음
		vehicle.run();
	}
}
