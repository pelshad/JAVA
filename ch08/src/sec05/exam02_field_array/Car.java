package sec05.exam02_field_array;

public class Car {
	// 구현 객체를 배열로 담음
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};
	
	public void run() {
		//향상된 for문을 활용
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
