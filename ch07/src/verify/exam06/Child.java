package verify.exam06;

public class Child extends Parent {
	String name;
	
	Child() {
		this("ȫ�浿");
		System.out.println("�� ��°�� ���� �޼ҵ�?");
	}
	
	Child(String name){
		this.name = name;
		System.out.println("�� ��°�� ���� �޼ҵ�?");
	}

}
