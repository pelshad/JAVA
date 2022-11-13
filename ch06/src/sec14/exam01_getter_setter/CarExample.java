package sec14.exam01_getter_setter;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		//System.out.println(myCar.speed);
		//private키이기 때문에 불가능
		System.out.println(myCar.getSpeed());
		System.out.println(myCar.isStop());
		System.out.println();

		myCar.setSpeed(60);
		myCar.setStop(false);
		System.out.println(myCar.getSpeed());
		System.out.println(myCar.isStop());
		System.out.println();
	
		myCar.setSpeed(-60);
		//setter의 조건으로 인해 -값이 안됨
		myCar.setStop(false);
		System.out.println(myCar.getSpeed());
		System.out.println(myCar.isStop());
		System.out.println();
		
		myCar.setSpeed(60);
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println(myCar.getSpeed());
		System.out.println(myCar.isStop());
	}

}
