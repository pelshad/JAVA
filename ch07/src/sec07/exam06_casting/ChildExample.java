package sec07.exam06_casting;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		//부모타입으로 정된 값만 사용가능
		//parent.field2 = "data2";
		//parent.method3();
		
		//강제 타입 변환 후 사용가능
		Child child = (Child) parent;
		child.field2 = "data2";
		child.method3();

	}

}
