package sec04.exam01_objects;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {
	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);
		
		//Objects�� compare�޼ҵ� ȣ��(Ŭ������, Ŭ������, Comparator(�񱳹��))
		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);
		//���� sno�� ������ ������ 0����
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
	
	//*Comparator�� �����ϱ� ���� ���� Ŭ���� ����(���Ⱑ �߿�)
	static class StudentComparator implements Comparator<Student>{
		//�߻� �޼ҵ� compare�� ������
		@Override
		public int compare(Student a, Student b) {
			// ù��° ���(���� �ۼ�)
			//a�� �ʵ尪(�̹� ��쿣 sno)�� b�� �ʵ尪�� ���Ͽ� ���� ���, 0, ���� ����
			//���� -1, 1�� ������ �ʿ�� ����
//			if(a.sno < b.sno) return -1;
//			else if(a.sno == b.sno) return 0;
//			else return 1;
			
			// �ι�° ���(Integer�� compare�޼ҵ� ���)
			return Integer.compare(a.sno, b.sno);
		}
		
	}
}
