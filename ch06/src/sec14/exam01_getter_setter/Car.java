package sec14.exam01_getter_setter;

public class Car {
	//getter, setter
	//클래스를 선언할 때 일반적으로 필드는 private로 접근제한을 한다.
	//이유
	//읽기 전용 필드가 있을 수 있음
	//외부에서 엉뚱한 값으로 변경 할 수 없도록 한다.
	//(ex.속도의 경우 -가 없는데 -값으로 변경한다거나)
	
	private int speed;
	private boolean stop;
	
	//getter
	//private의 필드값을 return하는 역할
	//getFieldName()로 만들며 boolean 타입의 경우 isFieldName()으로 만듬
	public int getSpeed() {
		return speed;
	}
	public boolean isStop() {
		return stop;
	}
	
	//setter
	//외부에서 주어진 값으로 필드 값 수정
	//필요한 경우 외부의 값의 유효성 검사를 한다.
	//setFieldName()로 만든다
	public void setSpeed(int speed) {
		//this.speed = speed로 지정할 경우 setter의 존재의의가 옅어짐
		this.speed = speed > 0 ? speed : 0;
		//외부에서 더이상 speed의 값을 -값으로 바꿀 수 없다!(유효성 검사) 
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) {
			speed = 0;
		}
	}
	
	//자동으로 getter, setter를 만드는 방법
	//source에서 generate Getters and Setters
}
