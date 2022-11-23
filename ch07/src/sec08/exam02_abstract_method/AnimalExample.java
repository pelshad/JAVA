package sec08.exam02_abstract_method;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound(); //dog에 오버라이딩된 메소드 호출
		cat.sound(); //cat에 오버라딩된 메소드 호출
		System.out.println();
		
		Animal animal = null;
		//자동 타입변환
		animal = new Dog();
		animal.sound(); // 오버라이딩된 dog sound 호출
		
		animal = new Cat();
		animal.sound(); // 오버라딩된 cat sound 호출
		System.out.println();
		
		animalSound(new Dog());//매개변수인 dog 호출
		animalSound(new Cat());//매개면수인 cat 호출
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
