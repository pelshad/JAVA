package sec05.exam01_final_class;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	// stop메소드는 final메소드라 오버라이드 되지 않음
	/*@Ovverrid
	public void stop() {
		
	}*/
	
}
