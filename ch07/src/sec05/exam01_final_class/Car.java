package sec05.exam01_final_class;

public class Car {
	public int speed;
	public void speedUp() {
		speed++;
	}
	public final void stop() {
		System.out.println("ÀÚ¸¦ ¸ØÃã");
		speed = 0;
	}
}
