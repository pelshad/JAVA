package sec05.exam05_instanceof;

public class Driver {
	public void drive(Vehicle vehicle) {
		//Bus객체가 매개변수로 들어왔을 경우 Casting,
		//하지만 무작정 Casting을 해버리면 예외가 발생 할 수 있으므로
		//instanceof 메소드를 통해 체크
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		
		vehicle.run();
	}
}
