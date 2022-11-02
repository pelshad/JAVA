package sec07.exam04_other_constructor_call;

public class Car {
	String company = "company";
	String model;
	int speed;
	String color;
	
	
	public Car() {}
	// 형태가 유사한 생성자가 존재할 경우 하드코딩 대신 this()를 활용!
	
	//비효율적인 오버로딩
	/* public Car(String model) {
		this.model = model;
		this.color = "민트";
		this.speed = 120;
	}
	
	public Car(String model, int speed) {
		this.model = model;
		this.color = "빨강";
		this.speed = speed;
	}
	
	public Car(String model, String color, int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
	} */
	
	
	// 효율적인 오버로딩
	// 1, 2번 생성자는 3번 생성자를 호출(this())하여 사용함
	// 1
	public Car(String model) {
		// 주의 this() 생성자 호출 코드 앞에 다른 코드가 있으면 오류 발생
		// System.out.println("실행"); 주석 풀면 에러 터짐
		this(model, "민트", 120);
		System.out.println("실행");
	}
	
	//2
	public Car(String model, int speed) {
		this(model, "빨강", speed);
	}
	
	//3
	public Car(String model, String color, int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	
	public String toString() {
		return company + " : " + model + " : " + speed + " : " + color; 
	}
	
	
}
