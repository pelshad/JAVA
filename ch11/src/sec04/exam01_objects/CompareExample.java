package sec04.exam01_objects;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {
	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);
		
		//Objects의 compare메소드 호출(클래스명, 클래스명, Comparator(비교방법))
		int result = Objects.compare(s1, s2, );
	}
	
	static class Student {
		int sno;
		Student(int sno){
			this.sno = sno;
		}
	}
	
	//Comparator를 구현하기 위한 구현 클래스 생성
	static class StudentComparator implements Comparator<Student>{
		//추상 메소드 compare를 재정의
		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
}
