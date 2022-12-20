package sec03.exam05_deep_clone;

import java.util.Arrays;

public class Member implements Cloneable{
	//���� ���� ���
	public String name;
	public int age;
	//����Ÿ�� �ʵ�(clone�� �ּҰ��� ����)
	public int[] scores;
	public Car car;
	
	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//���� �������Ǵ� �ʵ带 �����ϱ� ���� �θ�(Object) clone�޼ҵ� ȣ��
		Member cloned = (Member) super.clone();
		//�迭�� �����ϴ� �޼ҵ�
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		//������ ��ü�� ������ ȣ��
		cloned.car = new Car(this.car.model);
		return cloned;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			//�������̵��� Ŭ�и޼ҵ� ȣ��
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
}
