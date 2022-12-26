package sec04.exam03_objects_hash;

import java.util.Objects;

public class HashCodeExample {
	public static void main(String[] args) {
		
	}
	
	static class Student{
		int sno;
		String name;
		
		Student(int sno, String name){
			this.sno = sno;
			this.name = name;
		}
		
		@Override
		public int hashCode() {
			//return sno or name.hashCode();
			//�̷��� �ۼ��ϸ� ���߿� �ϳ��� ���Ƶ� ���ü�� �ν���
			return Objects.hash(sno, name);
			//int���� hash()�޼ҵ� �ȿ��� integer�� ��ȯ��(��üȭ)
			//sno, name�� ���� �̿��Ͽ� hashCode�� ����
			
		}
		
		//Ȯ���� ����񱳸� ���� equals�� ������
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Student) {
				Student s = (Student) obj;
				if(s.sno == this.sno) {
					if(s.name.equals(this.name)) {
						return true;
					}
				}
			}
			return false;
		}
	}
}
