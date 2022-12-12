package sec02_runtime_exception;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		/*
		//Animal타입으로 Dog를 참조하여 인스턴스 생성
		Animal animal = new Dog();
		//Dog타입으로 animal인스턴스를 참조하여 인스턴스 생성(강제 타입 변환)
		Dog dog = (Dog) animal;
		
		//Cat타입으로 animal인스턴스를 참조하려하지만 animal은
		//Dog를 참조하는 객체기 때문에 ClassCastException
		Cat cat = (Cat) animal;
		*/
		
		Dog dog = new Dog();
		//이상 없이 작동
		changeDog(dog);
		
		Cat cat = new Cat();
		//ClassCastException
		changeDog(cat);
		
	}
	
	public static void changeDog(Animal animal) {
		//resolve instanceof 메소드 활용
		//객체 instanceof 타입 으로 체크하여 boolean 타입 리턴
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
		}
	}
	
}
	class Animal{}
	class Dog extends Animal {}
	class Cat extends Animal {}
