package sec04.exam01_objects;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {
	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);
		
		//Objects�� compare�޼ҵ� ȣ��(Ŭ������, Ŭ������, Comparator(�񱳹��))
		int result = Objects.compare(s1, s2, );
	}
	
	static class Student {
		int sno;
		Student(int sno){
			this.sno = sno;
		}
	}
	
	//Comparator�� �����ϱ� ���� ���� Ŭ���� ����
	static class StudentComparator implements Comparator<Student>{
		//�߻� �޼ҵ� compare�� ������
		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
}
