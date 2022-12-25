package sec04.exam01_objects;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {
	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);
		
		//Objects의 compare메소드 호출(클래스명, 클래스명, Comparator(비교방법))
		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);
		//같은 sno을 가졌기 때문에 0리턴
		int result2 = Objects.compare(s1, s3, new StudentComparator());
		System.out.println(result2);
		int result3 = Objects.compare(s3, s1, new StudentComparator());
		System.out.println(result3);
	}
	
	static class Student {
		int sno;
		Student(int sno){
			this.sno = sno;
		}
	}
	
	//*Comparator를 구현하기 위한 구현 클래스 생성(여기가 중요)
	static class StudentComparator implements Comparator<Student>{
		//추상 메소드 compare를 재정의
		@Override
		public int compare(Student a, Student b) {
			// 첫번째 방법(직접 작성)
			//a의 필드값(이번 경우엔 sno)과 b의 필드값을 비교하여 각각 양수, 0, 음수 리턴
			//굳이 -1, 1을 리턴할 필요는 없음
//			if(a.sno < b.sno) return -1;
//			else if(a.sno == b.sno) return 0;
//			else return 1;
			
			// 두번째 방법(Integer의 compare메소드 사용)
			return Integer.compare(a.sno, b.sno);
		}
		
	}
}
