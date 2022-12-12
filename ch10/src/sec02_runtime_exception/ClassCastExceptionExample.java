package sec02_runtime_exception;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		/*
		//AnimalŸ������ Dog�� �����Ͽ� �ν��Ͻ� ����
		Animal animal = new Dog();
		//DogŸ������ animal�ν��Ͻ��� �����Ͽ� �ν��Ͻ� ����(���� Ÿ�� ��ȯ)
		Dog dog = (Dog) animal;
		
		//CatŸ������ animal�ν��Ͻ��� �����Ϸ������� animal��
		//Dog�� �����ϴ� ��ü�� ������ ClassCastException
		Cat cat = (Cat) animal;
		*/
		
		Dog dog = new Dog();
		//�̻� ���� �۵�
		changeDog(dog);
		
		Cat cat = new Cat();
		//ClassCastException
		changeDog(cat);
		
	}
	
	public static void changeDog(Animal animal) {
		//resolve instanceof �޼ҵ� Ȱ��
		//��ü instanceof Ÿ�� ���� üũ�Ͽ� boolean Ÿ�� ����
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
		}
	}
	
}
	class Animal{}
	class Dog extends Animal {}
	class Cat extends Animal {}
