package sec08.exam02_abstract_method;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound(); //dog�� �������̵��� �޼ҵ� ȣ��
		cat.sound(); //cat�� ��������� �޼ҵ� ȣ��
		System.out.println();
		
		Animal animal = null;
		//�ڵ� Ÿ�Ժ�ȯ
		animal = new Dog();
		animal.sound(); // �������̵��� dog sound ȣ��
		
		animal = new Cat();
		animal.sound(); // ��������� cat sound ȣ��
		System.out.println();
		
		animalSound(new Dog());//�Ű������� dog ȣ��
		animalSound(new Cat());//�Ű������ cat ȣ��
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
