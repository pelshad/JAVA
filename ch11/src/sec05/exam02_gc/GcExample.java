package sec05.exam02_gc;

public class GcExample {

	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1);
		emp = null;
		emp = new Employee(2);
		emp = new Employee(3);
		
		System.out.print("emp가 최종적으로 참조하는 번호 : " );
		System.out.println(emp.eno);
		//이대로 끝나면 JVM이 종료되기 때문에 소멸자가 실행되지 않고
		//프로그램이 종료됨으로써 메모리가 정리된다.
		
		//따라서 gc는 마지막 줄에 사용하기보다는 프로그램 실행 도중 과부하가 걸릴
		//만 할때 걸어주어 메모리를 정리할 때 이용
		System.gc();
	}

}
